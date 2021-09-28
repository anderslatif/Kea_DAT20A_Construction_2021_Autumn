package dk.andl.paintings.controllers;

import dk.andl.paintings.models.Painting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Paintings {

    private ArrayList<Painting> paintings = new ArrayList<>();

    @GetMapping("/paintings")
    public ArrayList<Painting> getPaintings() {
        return paintings;
    }

    // GET /paintings/1
    // todo implement GET /paintings/1

    @PostMapping("/paintings")
    public Painting addPainting(@RequestBody Painting painting) {
        paintings.add(painting);
        return painting;
    }






}

