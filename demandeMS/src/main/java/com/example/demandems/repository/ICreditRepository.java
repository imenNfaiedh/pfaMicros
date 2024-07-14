package com.example.demandems.repository;

import com.example.demandems.entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ICreditRepository extends JpaRepository<Credit,Integer> {
}
