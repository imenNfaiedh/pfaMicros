package com.example.parametragems.Controller;

import com.example.parametragems.dto.ConventionRequest;
import com.example.parametragems.services.IConventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@RestController
@RequestMapping("/conventions")

public class ConventionController {

    @Autowired
    private IConventionService conventionService;


    @GetMapping("/get")
    public String home() {
        return "<h2>Microservice parametrage is running is running</h2>";
    }


    @PostMapping()
    public void createConvention(@RequestBody ConventionRequest request)
    {
         conventionService.createConvention(request.getPartenaireId(), request.getModaliteId(),  request.getSigantureDate());
    }
}

