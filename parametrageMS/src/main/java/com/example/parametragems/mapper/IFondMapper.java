package com.example.parametragems.mapper;

import com.example.parametragems.dto.FondDto;
import com.example.parametragems.entities.Fond;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFondMapper {
    FondDto toDto (Fond fond);
    List<FondDto> toDto (List<Fond> fonds);

    Fond toEntity (FondDto fondDto);
    List<Fond> toEntity (List<FondDto> fondDtos);

}
