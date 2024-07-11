package com.example.parametragems.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class Partenaire {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private  int idPartenaire;
    private String nomPartenaire;
    private String adresse;
    private Long telephone;
    private String mail;

    @OneToMany(mappedBy = "partenaire")
    private List<Convention> conventions;


}
