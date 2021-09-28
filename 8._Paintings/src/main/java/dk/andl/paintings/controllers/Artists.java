package dk.andl.paintings.controllers;

import dk.andl.paintings.models.Artist;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Artists {

    @GetMapping("/artists")
    public Artist getArtists() {
        return null;
    }

    // implement all the empty routes so we can start working on them Thursday

}
