package com.example.demandems.service;

import com.example.demandems.dto.DemandeDto;
import com.example.demandems.dto.ModaliteDto;
import com.example.demandems.dto.PartenaireDto;
import com.example.demandems.entities.Demande;

import java.util.List;

public interface IDemandeService {

    List<DemandeDto> getAllDemande();
    DemandeDto getByIdDemande(int id);
    DemandeDto createDemande(DemandeDto demandeDto);
    DemandeDto updateDemande(Demande demande,int id);
    void deleteDemand(int id);

     PartenaireDto getByIdPartner(int id);
     ModaliteDto getByIdModalite(int id);



    // DemandeDto affecterIdPartenaire(int idDemande, int idPartenaire, int idModalite);


}
