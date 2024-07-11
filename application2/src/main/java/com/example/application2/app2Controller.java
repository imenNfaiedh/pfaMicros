package com.example.application2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/app2")


public class app2Controller {


        @GetMapping("/get")
        public String home() {
            return "<h2>Microservice two is running</h2>";
        }



}
