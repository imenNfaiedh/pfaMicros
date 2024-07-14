package com.example.parametragems.mapper;

import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Partenaire;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")


public interface IPartenaireMapper {

    Partenaire toEntity (PartenaireDto partenaireDto);
    List<Partenaire> toEntity(List<PartenaireDto> partenaireDtos);
    PartenaireDto toDto (Partenaire partenaire);
    List<PartenaireDto> toDto(List<Partenaire> partenaires);
}
