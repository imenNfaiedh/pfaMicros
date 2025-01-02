package com.example.parametragems.services;

import com.example.parametragems.dto.ConventionDto;
import com.example.parametragems.dto.ConventionGetDto;
import com.example.parametragems.dto.ConventionRequest;
import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Convention;

import java.util.Date;
import java.util.List;

public interface IConventionService {
    boolean checkConvention (int partenaireId,int modaliteId);
    List<ConventionGetDto> getConventionsByPartenaireId(int idPartenaire) ;
    void createConvention(int idPartenaire , int idModalite , Date dateSignature);



    }
