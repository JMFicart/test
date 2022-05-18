package base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Texte2Controller {
    @GetMapping("/gettext")
    public String getText(){
        return "ABCD";
    }
}
