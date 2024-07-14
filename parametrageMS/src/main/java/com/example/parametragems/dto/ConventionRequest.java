package com.example.parametragems.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ConventionRequest {


    private int   partenaireId ;
    private  int  modaliteId ;
    private Date  sigantureDate;
}
