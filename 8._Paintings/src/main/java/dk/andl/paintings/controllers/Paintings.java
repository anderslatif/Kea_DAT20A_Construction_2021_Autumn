package dk.andl.paintings.controllers;

import dk.andl.paintings.models.Painting;
import dk.andl.paintings.repositories.PaintingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Paintings {

    @Autowired
    PaintingRepository paintings;

    @GetMapping("/paintings")
    public Iterable<Painting> getPaintings() {
        return paintings.findAll();
    }

    @GetMapping("/paintings/{id}")
    public Painting getPainting(@PathVariable Long id) {
        return paintings.findById(id).get();
    }

    @PostMapping("/paintings")
    public Painting addPainting(@RequestBody Painting newPainting) {
        // don't allow the client to overwrite the id
        newPainting.setId(null);
        return paintings.save(newPainting);
    }

    @PutMapping("/paintings/{id}")
    public String updatePaintingById(@PathVariable Long id, @RequestBody Painting paintingToUpdateWith) {
        if (paintings.existsById(id)) {
            paintingToUpdateWith.setId(id);
            paintings.save(paintingToUpdateWith);
            return "Painting was created";
        } else {
            return "Painting not found";
        }
    }

    @DeleteMapping("/paintings/{id}")
    public void deletePaintingById(@PathVariable Long id) {
        paintings.deleteById(id);
    }
}
