package com.example.parametragems.repository;

import com.example.parametragems.entities.Convention;
import com.example.parametragems.entities.Fond;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFondRepository  extends JpaRepository<Fond,Integer> {
}
