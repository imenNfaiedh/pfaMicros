package com.example.parametragems.services.imp;


import com.example.parametragems.entities.Convention;
import com.example.parametragems.entities.Modalite;
import com.example.parametragems.entities.Partenaire;
import com.example.parametragems.repository.IConventionRepository;
import com.example.parametragems.repository.IModaliteRepository;
import com.example.parametragems.repository.IPartenaireRepository;
import com.example.parametragems.services.IConventionService;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ConventionServiceImp  implements IConventionService {


    @Autowired
    IConventionRepository conventionRepository;


    @Autowired
    IPartenaireRepository partenaireRepository;


    @Autowired
    IModaliteRepository modaliteRepository;

    @Override
    public void createConvention(int idPartenaire, int idModalite, Date dateSignature) {

        Partenaire partenaire = partenaireRepository.findById(idPartenaire).orElseThrow(
                () -> new RuntimeException("Convention not found")
        );


        Modalite modalite = modaliteRepository.findById(idModalite).orElseThrow(
                () -> new RuntimeException("Modalite not found")
        );

        Convention convention = new Convention();
        convention.setPartenaire(partenaire);
        convention.setModalite(modalite);
        convention.setDateSignature(dateSignature);
        conventionRepository.save(convention);
    }
}
