package com.example.demandems.service;

import com.example.demandems.dto.CreditDto;
import com.example.demandems.entities.Credit;

import java.util.List;

public interface ICreditService {

    List<CreditDto> getAllCredit();
    CreditDto getByIdCredit(int id);
    CreditDto createCredit(Credit credit);
    CreditDto updateCredit (Credit credit , int id);
    void  deleteCredit (int id);
}
