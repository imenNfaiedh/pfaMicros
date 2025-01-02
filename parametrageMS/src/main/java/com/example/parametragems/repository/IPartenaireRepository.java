package com.example.parametragems.repository;

import com.example.parametragems.entities.Convention;
import com.example.parametragems.entities.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPartenaireRepository extends JpaRepository<Partenaire,Integer> {
  //  boolean existsByIdPartenaireAndIdModalite(int idPartenaire, int idModalite);

}
