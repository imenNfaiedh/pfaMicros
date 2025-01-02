package com.example.parametragems.mapper;

import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.entities.Modalite;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")


public interface IModaliteMapper {

    @Mapping(target = "nameFond" , source = "fond.nomCompletFond")
    @Mapping(target = "fondId" , source = "fond.idFond")


    ModaliteDto toDto (Modalite modalite);
    List<ModaliteDto> toDto (List<Modalite> modalites);

    Modalite toEntity (ModaliteDto modaliteDto);
    List<Modalite> toEntity (List<ModaliteDto> modaliteDtos);

}
