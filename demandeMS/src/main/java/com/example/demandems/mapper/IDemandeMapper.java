package com.example.demandems.mapper;

import com.example.demandems.dto.DemandeDto;
import com.example.demandems.entities.Demande;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})

public interface IDemandeMapper {
    DemandeDto toDto (Demande demande);
    List<DemandeDto> toDto(List<Demande> demande);
    Demande toEntity (DemandeDto demandeDto);
    List<Demande> toEntity (List<DemandeDto> demandeDto);
}
