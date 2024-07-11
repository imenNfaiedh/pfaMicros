package com.example.application1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "etudiant")
public class Etudiant  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long EtudiantId;
    private String name;

}
