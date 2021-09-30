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
    public Artist getArtists(@PathVariable Long id) {
        return artists.findById(id).get();
    }

    @PostMapping("/artists")
    public Artist addArtist(@RequestBody Artist newArtist) {
        // don't allow the client to overwrite the id
        newArtist.setId(null);
        return artists.save(newArtist);
    }

    @PutMapping("/artists/{id}")
    public Artists updateArtistById(@PathVariable Long id, @RequestBody Artist artist) {
        artist.setName("test");
        return null;
    }

    @DeleteMapping("/artists/{id}")
    public void deleteArtistById(@PathVariable Long id) {
        artists.deleteById(id);
    }
}
