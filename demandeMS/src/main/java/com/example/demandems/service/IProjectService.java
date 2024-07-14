package com.example.demandems.service;

import com.example.demandems.dto.ProjectDto;
import com.example.demandems.entities.Project;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IProjectService {
    List<ProjectDto> getAllProject();
    ProjectDto getByIdProject(int id);
    ProjectDto createProject (Project project);
    ProjectDto updateProject (Project project , int id);

    void deleteProject (int id);
}
