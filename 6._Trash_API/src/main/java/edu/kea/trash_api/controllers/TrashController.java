package edu.kea.trash_api.controllers;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

//@RequestMapping("/root")
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


    @GetMapping("/sevendeadlysins/{sinNumber}")
    public String getADeadlySin(@PathVariable int sinNumber) {
        try {
            return deadlySins[sinNumber];
        } catch (Exception error) {
            return "You have not sinned";
        }
    }

    // todo http://localhost:8080/trash?trash=socks%20tissue&otherTrash=celebrities

    @GetMapping("/trash")
    public String throwTrashBackAtClient(@RequestParam String trash, @RequestParam(required = false) String otherTrash) {
        return trash + ", " + otherTrash;
    }

}
