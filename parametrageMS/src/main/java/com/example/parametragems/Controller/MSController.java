package com.example.parametragems.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/para")

public class MSController {
    @GetMapping("/get")
    public String home() {
        return "<h2>Microservice parametrageMS  is running</h2>";
    }

}
