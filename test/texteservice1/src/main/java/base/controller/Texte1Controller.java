package base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Texte1Controller {
    @GetMapping("/gettext")
    public String getText(){
        return "EFGH";
    }
}
