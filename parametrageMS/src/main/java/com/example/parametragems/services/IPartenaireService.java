package com.example.parametragems.services;

import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Partenaire;

import java.util.List;

public interface IPartenaireService {
   // boolean checkConvention (int idPartenaire ,int idModalite);


    List<PartenaireDto> getAllPartner();
    PartenaireDto getByIdPartner(int id);
    PartenaireDto createPartner(Partenaire partenaire);
    PartenaireDto updatePartner (PartenaireDto partenaireDto , int id);

    void deletePartner(int id);


}
