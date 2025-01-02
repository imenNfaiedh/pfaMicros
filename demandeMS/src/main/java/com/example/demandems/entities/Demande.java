package com.example.demandems.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
public class Demande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private int idDemande ;
    private int  idModalite;
    private int idPartenaire;
    private String nameDemande;

    @OneToOne
    private Credit credit;

    @OneToOne(mappedBy = "demande")
    private Project project;



}
