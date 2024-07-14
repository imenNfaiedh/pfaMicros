package com.example.parametragems.services;

import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.entities.Modalite;

import java.util.List;

public interface IModaliteService {

    List<ModaliteDto> getAllModalite();
    ModaliteDto getByIdModalite(int id);
    ModaliteDto createModalite (Modalite modalite);
    ModaliteDto updateModalite (Modalite modalite , int id);

    void deleteModalite (int id);
}
