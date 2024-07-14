package com.example.demandems.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CreditDto {

    private int idCredit;
    private Long montantCredit;
    private Long dureeCredit;
    private Date dateAutorisation;
    private Date dateBlockage;
}
