package edu.kea.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PokemonController {

    List<String> pokemon = new ArrayList<>(){{
        add("Pikachu");
        add("Charizard");
        add("Bulbasaur");
        add("Mew");
        add("Slowpoke");
    }};


    @GetMapping("/pokemon/go")
    public boolean isGo() {
        return true;
    }

    @GetMapping("/pokemon")
    public List<String> getAllPokemon() {
        return pokemon;
    }

}
