package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${hello}")
    public String hello;

    @GetMapping("/hello")
    public String getHello(){
        return hello;
    }
}
