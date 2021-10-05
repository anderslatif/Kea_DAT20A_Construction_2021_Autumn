package dk.andl.paintings.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dk.andl.paintings.models.Painting;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//@RestController
/*public class DeprecatedPaintings {

    private ArrayList<Painting> paintings = new ArrayList<>();

    @GetMapping("/paintings")
    public ArrayList<Painting> getPaintings() {
        return paintings;
    }

    @GetMapping("/paintings/{id}")
    public Painting getPaintingById(@PathVariable int id) {
        return paintings.get(id);
    }

    @PostMapping("/paintings")
    public Painting addPainting(@RequestBody Painting painting) {
        paintings.add(painting);
        return painting;
    }

    @PutMapping("/paintings/{id}")
    public Painting updatePainting(@PathVariable int id, @RequestBody Painting newPainting) {
        paintings.set(id, newPainting);
        return newPainting;
    }

    @PatchMapping("/paintings/{id}")
    public Painting patchPainting(@PathVariable int id, @RequestBody String body) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Painting newPainting = mapper.readValue(body, Painting.class);
            paintings.set(id, newPainting);
            return newPainting;
        } catch (JsonProcessingException error) {
            System.out.println(error);
            Painting unknownPainting = new Painting("Unknown artist");
            paintings.set(id, unknownPainting);
            return unknownPainting;
        }
    }


    @DeleteMapping("/paintings/{id}")
    public Painting deletePaintingById(@PathVariable int id){
        return paintings.remove(id);
    }

}*/

