package com.example.demandems.dto;

import lombok.Data;

import java.util.Date;
@Data

public class ConventioDto {

    private int idConvention;

    private int   partenaireId ;
    private  int  modaliteId ;
    private Date sigantureDate;
}
