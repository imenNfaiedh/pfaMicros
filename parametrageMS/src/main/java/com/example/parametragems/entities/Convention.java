package com.example.parametragems.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class Convention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idConvention;
    private Date dateSignature;

    @ManyToOne
    private Partenaire partenaire;

    @ManyToOne
    private Modalite modalite;





}
