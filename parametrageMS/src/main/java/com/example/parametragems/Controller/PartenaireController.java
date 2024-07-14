package com.example.parametragems.Controller;

import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Partenaire;
import com.example.parametragems.services.IPartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partners")

public class PartenaireController {

    @Autowired
    private IPartenaireService partenaireService;


    @PostMapping()
    public PartenaireDto createPartner(@RequestBody Partenaire partenaire)
    {
        return partenaireService.createPartner(partenaire);
    }

}
