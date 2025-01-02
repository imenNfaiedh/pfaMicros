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
@Table(name = "003T_CONVENTION")
public class Convention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idConvention;
    private Date dateSignature;

    @ManyToOne
    @JoinColumn(name = "PARTENAIRE_IDFK")
    private Partenaire partenaire;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Modalite modalite;





}
