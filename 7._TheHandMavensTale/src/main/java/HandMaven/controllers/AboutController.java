package HandMaven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @GetMapping("/about")
    public String aboutThisProject() {
        return "This was made by hand. Feels good doesn't it?";
    }

}
