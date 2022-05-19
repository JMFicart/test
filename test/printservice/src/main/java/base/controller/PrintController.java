package base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PrintController {
    public PrintController(RestTemplate resttemplate) {
        this.resttemplate = resttemplate;
    }

    private final RestTemplate resttemplate;

    @GetMapping("/commonplace")
    public String printcontroller(){
        return resttemplate.getForObject("http://texte-service/commonplace", String.class);
    }


}
