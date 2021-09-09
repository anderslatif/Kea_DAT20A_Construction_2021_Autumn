package edu.kea.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

@RequestMapping("/root")
@RestController
public class TrashController {

    static String[] deadlySins = {"Greed", "Gluttony",
            "Wrath", "Lust", "Envy", "Sloth", "Pride"};

    @GetMapping("/")
    public String frontpage() {
        return "Hi there.";
    }

    @GetMapping("/clock")
    public Date clock() {
        return new Date();
    }

    @RequestMapping(value="/endpoint", method = RequestMethod.GET)
    public String requestMappingTypeEndpoint() {
        return "Endpoint with Request mapping annotation";
    }

    // todo create a route that gives one of the seven deadly sins based on a number
    // todo you are allowed to hardcode the number inside the route for now
    @GetMapping("/sevendeadlysins")
    public String getADeadlySin() {
        // todo implement this
        return null;
    }


}
