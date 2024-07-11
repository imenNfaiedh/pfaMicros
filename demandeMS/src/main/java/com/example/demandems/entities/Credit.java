package com.example.demandems.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idCredit;
    private Long montantCredit;
    private Long dureeCredit;
    private Date dateAutorisation;
    private Date dateBlockage;

    @OneToOne (mappedBy = "credit")
    private Demande demande;


}
