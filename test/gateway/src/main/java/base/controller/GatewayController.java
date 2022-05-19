package base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {

    private final RestTemplate restTemplate;

    public GatewayController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    @GetMapping("/print")
    @GetMapping("/print/commonplace")
//    public String fromPrintService(){
//        return restTemplate.getForObject("http://print-service/print", String.class);
//    }
    public String fromPrintService(){
        return restTemplate.getForObject("http://print-service/commonplace", String.class);
    }

//    @GetMapping("/gettext")
    @GetMapping("/gettext/commonplace")
//    public String fromTexteService(){
//        return restTemplate.getForObject("http://texte-service/gettext", String.class);
//    }
    public String fromTexteService(){
        return restTemplate.getForObject("http://texte-service/commonplace", String.class);
    }
}
