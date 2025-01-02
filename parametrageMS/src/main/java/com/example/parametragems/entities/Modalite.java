package com.example.parametragems.entities;

import com.example.parametragems.enumeration.TypeModalite;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class Modalite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idModalite;
    private  String nomCompletModalite ;
    private Long montantMin;
    private Long montantMax;

    @Enumerated(EnumType.STRING)
    private TypeModalite typeModalite;


    @OneToMany(mappedBy = "modalite" ,cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Convention> conventions;

    @ManyToOne
    private Fond fond;
}
