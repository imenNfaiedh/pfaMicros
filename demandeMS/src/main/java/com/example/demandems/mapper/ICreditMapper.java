package com.example.demandems.mapper;

import com.example.demandems.dto.CreditDto;
import com.example.demandems.entities.Credit;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})

public interface ICreditMapper {

    CreditDto toDto (Credit credit);
    List<CreditDto> toDto (List<Credit> credit);
    Credit toEntity (CreditDto creditDto);
    List<Credit> toEntity (List<CreditDto> creditDto);
}
