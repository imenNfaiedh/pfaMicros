package com.example.demandems.controller;

import com.example.demandems.dto.DemandeDto;
import com.example.demandems.dto.ProjectDto;
import com.example.demandems.entities.Demande;
import com.example.demandems.entities.Project;
import com.example.demandems.service.IDemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demandes")
public class demandeController {

    @Autowired
    private IDemandeService demandeService;

    @PostMapping("/")
    public DemandeDto createDemande(@RequestBody Demande demande)
    {
        return demandeService.createDemande(demande);
    }

    @GetMapping("/")
    public ResponseEntity<List<DemandeDto>> getAllDemande()
    {
        return ResponseEntity.ok(demandeService.getAllDemande());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DemandeDto> getByIdDemande (@PathVariable int id)
    {
        return ResponseEntity.ok(demandeService.getByIdDemande(id));
    }

    @PutMapping("/{id}")
    public DemandeDto updateDemande(@PathVariable int id, @RequestBody Demande demande)
    {
        demande.setIdDemande(id);
        return demandeService.updateDemande(demande,id);
    }

    @DeleteMapping("/{id}")
    public void deleteDemande(@PathVariable int id)

    {
        demandeService.deleteDemand(id);
    }



}
