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
    private String  modalite;
    private String partenaire;

    @OneToOne
    private Credit credit;

    @OneToOne(mappedBy = "demande")
    private Project project;
}
