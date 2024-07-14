package com.example.parametragems.Controller;

import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.entities.Modalite;
import com.example.parametragems.services.IModaliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modalite")

public class ModaliteController {


    @Autowired
    private IModaliteService modaliteService;

    @PostMapping()
    public ModaliteDto createModalite(@RequestBody Modalite modalite)
    {
        return modaliteService.createModalite(modalite);
    }


}
