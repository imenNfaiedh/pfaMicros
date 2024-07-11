package com.example.demandems.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int idProject;
    private String nomProject;
    private String description;

    @Enumerated(EnumType.STRING)
    private TypeProjet typeprojet;

    @OneToOne Demande demande;


}
