package com.example.parametragems.repository;

import com.example.parametragems.entities.Convention;
import com.example.parametragems.entities.Modalite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModaliteRepository extends JpaRepository<Modalite,Integer> {
}
