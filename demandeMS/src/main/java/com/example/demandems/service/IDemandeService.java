package com.example.demandems.service;

import com.example.demandems.dto.DemandeDto;
import com.example.demandems.entities.Demande;

import java.util.List;

public interface IDemandeService {

    List<DemandeDto> getAllDemande();
    DemandeDto getByIdDemande(int id);
    DemandeDto createDemande(Demande demande);
    DemandeDto updateDemande(Demande demande,int id);
    void deleteDemand(int id);

}
