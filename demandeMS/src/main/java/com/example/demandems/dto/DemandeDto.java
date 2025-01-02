package com.example.demandems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DemandeDto {

    private String nameDemande;

    private int idDemande ;
    private int  idModalite;
    private int idPartenaire;


}
