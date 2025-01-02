package com.example.parametragems.dto;


import com.example.parametragems.entities.Convention;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ConventionRequest {


    private int   partenaireId ;
    private  int  modaliteId ;
    private Date  sigantureDate;




}
