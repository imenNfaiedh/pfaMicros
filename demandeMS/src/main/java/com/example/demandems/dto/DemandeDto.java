package com.example.demandems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DemandeDto {

    private int idDemande ;
    private String  modalite;
    private String partenaire;
}
