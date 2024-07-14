package com.example.demandems.dto;

import com.example.demandems.entities.TypeProjet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProjectDto {
    private int idProject;
    private String nomProject;
    private String description;
    private TypeProjet typeProjet;
}
