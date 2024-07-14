package com.example.parametragems.dto;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConventionDto {

    private int idConvention;
    private Date dateSignature;

}
