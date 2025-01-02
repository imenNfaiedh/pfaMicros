package com.example.parametragems.mapper;

import com.example.parametragems.dto.ConventionGetDto;
import com.example.parametragems.entities.Convention;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")


public interface IConventionGetMapper {
    @Mapping(target = "nameModalite" , source = "modalite.nomCompletModalite")
    @Mapping(target = "namePartenaire" , source = "partenaire.nomPartenaire")
    @Mapping(target = "sigantureDate" , source = "convention.dateSignature")




    ConventionGetDto toDto (Convention convention);
    List<ConventionGetDto> toDto (List<Convention> convention);

    Convention toEntity (ConventionGetDto conventionGetDto);
    List<Convention> toEntity (List<ConventionGetDto> conventionGetDtos);
}
