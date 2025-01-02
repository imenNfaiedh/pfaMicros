package com.example.demandems.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StartProcessRequest {

    private String demandeId;
    private String userTosend;
    private String dateSaisie;
}
