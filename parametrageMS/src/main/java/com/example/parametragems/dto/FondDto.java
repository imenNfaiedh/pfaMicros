package com.example.parametragems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FondDto {

    private int idFond;
    private  String nomCompletFond;
    private Long montantMin;
    private Long montantMax;
    private Date dateDemarrageFond;
    private  Date dateClotureFond;
}
