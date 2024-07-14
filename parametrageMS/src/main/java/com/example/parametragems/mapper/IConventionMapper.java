package com.example.parametragems.mapper;

import com.example.parametragems.dto.ConventionDto;
import com.example.parametragems.entities.Convention;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface IConventionMapper {

    ConventionDto toDto (Convention convention);

    List<ConventionDto> toDto (List<Convention> conventions);
    Convention toEntity (ConventionDto conventionDto);
    List<Convention> toEntity ( List<ConventionDto> conventionDto);


}
