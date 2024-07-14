package com.example.parametragems.dto;

import com.example.parametragems.entities.TypeModalite;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class ModaliteDto {

    private int idModalite;
    private  String nomCompletModalite ;
    private Long montantMin;
    private Long montantMax;

    private TypeModalite typeModalite;
}