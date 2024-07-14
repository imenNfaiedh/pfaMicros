package com.example.demandems.repository;

import com.example.demandems.entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDemandeRepository extends JpaRepository<Demande,Integer> {
}
