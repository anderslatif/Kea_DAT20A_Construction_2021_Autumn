package dk.andl.paintings.controllers;

import dk.andl.paintings.models.Artist;
import dk.andl.paintings.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Artists {

    @Autowired
    ArtistRepository artists;

    @GetMapping("/artists")
    public Iterable<Artist> getArtists() {
        return artists.findAll();
    }

    @GetMapping("/artists/{id}")
    public Artist getArtist(@PathVariable Long id) {
        return artists.findById(id).get();
    }

    @PostMapping("/artists")
    public Artist addArtist(@RequestBody Artist newArtist) {
        // don't allow the client to overwrite the id
        newArtist.setId(null);
        return artists.save(newArtist);
    }

    @PostMapping("/artists/gallery/{artistId}/{galleryId}")
    public Artist addGalleryToArtist(@PathVariable Long artistId, @PathVariable Long galleryId) {
        // todo finish implementing this
//        Artist foundArtist = artists.findById(artistId).get();
//        System.out.println(foundArtist);
        return null;
    }

    @PutMapping("/artists/{id}")
    public String updateArtistById(@PathVariable Long id, @RequestBody Artist artistToUpdateWith) {
        if (artists.existsById(id)) {
            artistToUpdateWith.setId(id);
            artists.save(artistToUpdateWith);
            return "Artist was created";
        } else {
            return "Artist not found";
        }
    }

    @PatchMapping("/artists/{id}")
    public String patchArtistById(@PathVariable Long id, @RequestBody Artist artistToUpdateWith) {
        return artists.findById(id).map(foundArtist -> {
            if (artistToUpdateWith.getName() != null) foundArtist.setName(artistToUpdateWith.getName());
            if (artistToUpdateWith.getAge() != 0) foundArtist.setAge(artistToUpdateWith.getAge());
            if (artistToUpdateWith.getNationality() != null) foundArtist.setNationality(artistToUpdateWith.getNationality());
            if (artistToUpdateWith.getPrimaryStyle() != null) foundArtist.setPrimaryStyle(artistToUpdateWith.getPrimaryStyle());
            if (artistToUpdateWith.getBirthDate() != null) foundArtist.setBirthDate(artistToUpdateWith.getBirthDate());
            if (artistToUpdateWith.getGender() != null) foundArtist.setGender(artistToUpdateWith.getGender());

            artists.save(foundArtist);
            return "Artist updated";
        }).orElse("Artist not found");
    }

    @DeleteMapping("/artists/{id}")
    public void deleteArtistById(@PathVariable Long id) {
        artists.deleteById(id);
    }
}
