package com.example.application1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app1")

public class AppController {

    @GetMapping("/get")
    public String home() {
        return "<h2>Microservice one is running</h2>";
    }

}