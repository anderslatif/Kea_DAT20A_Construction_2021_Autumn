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
    public Artist getArtists(@PathVariable int id) {
        return null;
    }

    @PostMapping("/artists")
    public Artists addArtist(@RequestBody Artists artists) {
        return null;
    }

    @PutMapping("/artists/{id}")
    public Artists updateArtistById(@PathVariable int id, @RequestBody Artists artists){
        return null;
    }

    @DeleteMapping("/artists/{id}")
    public Artists deleteArtistById(@PathVariable int id){
        return null;
    }
}
