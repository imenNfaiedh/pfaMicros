package com.example.parametragems.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PartenaireDto {

    private  int idPartenaire;
    private String nomPartenaire;
    private String adresse;
    private Long telephone;
    private String mail;
}
