package com.example.parametragems.repository;

import com.example.parametragems.entities.Convention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConventionRepository extends JpaRepository<Convention,Integer> {
}
