package com.example.parametragems.repository;

import com.example.parametragems.entities.Convention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IConventionRepository extends JpaRepository<Convention,Integer> {


    boolean existsConventionByPartenaireIdPartenaireAndAndModaliteIdModalite(int PartenaireId, int ModaliteId);

    List<Convention> findByPartenaireIdPartenaire(int id);





}
