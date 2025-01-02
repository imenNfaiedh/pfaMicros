package com.example.demandems.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartenaireDto {
    private  Long idPartenaire;
    private String nomPartenaire;
    private String adresse;
    private Long telephone;
    private String mail;
}
