package com.example.parametragems.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PartenaireDto {

    private  int idPartenaire;
    private String nomPartenaire;
    private String adresse;
    private Long telephone;
    private String mail;

    private List<ConventionRequest> conventions; // Ajoutez cet attribut

}
