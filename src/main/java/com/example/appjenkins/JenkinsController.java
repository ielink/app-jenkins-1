package com.example.appjenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/lazy v5")
    public String getLazy() {
        return "lazy";
    }
}
