package com.example.demandems.mapper;

import com.example.demandems.dto.ProjectDto;
import com.example.demandems.entities.Project;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})

public interface IProjectMapper {
    ProjectDto toDto (Project project);
    List<ProjectDto> toDto(List<Project> project);

    Project toEntity (ProjectDto projectDto);
    List<Project> toEntity (List<ProjectDto> projectDto);
}
