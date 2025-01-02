package com.example.demandems.controller;

import com.example.demandems.dto.DemandeDto;
import com.example.demandems.dto.ModaliteDto;
import com.example.demandems.dto.PartenaireDto;
import com.example.demandems.entities.Demande;
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



    @PostMapping("")
    public DemandeDto createDemande(@RequestBody DemandeDto demandeDto)
    {

        return demandeService.createDemande(demandeDto);
    }

//    @PostMapping("/{idDemande}/{idPartenaire}/{idModalite}")
//    public ResponseEntity<DemandeDto> affecterIdPartenaire(
//            @PathVariable int idDemande,
//            @PathVariable int idPartenaire,
//            @PathVariable int idModalite) {
//        DemandeDto demandeDto = demandeService.affecterIdPartenaire(idDemande, idPartenaire,idModalite);
//        return ResponseEntity.ok(demandeDto);
//    }





    @GetMapping("/partners/{id}")
    public PartenaireDto getByIdPartner(@PathVariable int id) {
        return demandeService.getByIdPartner(id);
    }


    @GetMapping("/modalite/{id}")
    public ModaliteDto getByIdModalite(@PathVariable int id) {
        return demandeService.getByIdModalite(id);
    }







    @GetMapping("")
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
