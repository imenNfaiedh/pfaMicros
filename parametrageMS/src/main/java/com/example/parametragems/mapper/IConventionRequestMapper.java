package com.example.parametragems.mapper;

import com.example.parametragems.dto.ConventionDto;
import com.example.parametragems.dto.ConventionRequest;
import com.example.parametragems.entities.Convention;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")


public interface IConventionRequestMapper {

    ConventionRequest toDto (Convention convention);

    List<ConventionRequest> toDto (List<Convention> conventions);

}
