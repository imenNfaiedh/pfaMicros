package com.example.parametragems.services;

import com.example.parametragems.dto.FondDto;
import com.example.parametragems.entities.Fond;

import java.util.List;

public interface IFondService {

    List<FondDto> getAllFond();
    FondDto getByIdFond(int id);
    FondDto createFond (Fond fond );
    FondDto updateFond  (FondDto fondDto , int id);
    void deleteFond (int id);
}
