package com.example.demandems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demande")
public class demandeController {

    @GetMapping("/get")
    public String home() {
        return "<h2>Microservice parametrageMS  is running</h2>";
    }

}
