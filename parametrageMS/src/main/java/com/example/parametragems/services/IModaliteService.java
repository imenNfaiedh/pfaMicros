package com.example.parametragems.services;

import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.entities.Modalite;

import java.util.List;

public interface IModaliteService {

    List<ModaliteDto> getAllModalite();

    ModaliteDto getByIdModalite(int id);

    ModaliteDto createModalite(Modalite modalite);

    ModaliteDto updateModalite(ModaliteDto modaliteDto, int id);

    void deleteModalite(int id);
    public Modalite saveOrUpdateModalite(ModaliteDto  modaliteDto);

}
