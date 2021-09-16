package edu.kea.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperMarioController {

    @GetMapping("/supermario/characters")
    public String getCharacter() {
        return "Waluigi";
    }


}
