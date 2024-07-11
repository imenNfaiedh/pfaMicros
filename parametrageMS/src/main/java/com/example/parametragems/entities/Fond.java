package com.example.parametragems.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class Fond {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idFond;
    private  String nomCompletFond;
    private Long montantMin;
    private Long montantMax;
    private Date dateDemarrageFond;
    private  Date dateClotureFond;

    @OneToMany (mappedBy = "fond")
    private List<Modalite> modalite;
}
