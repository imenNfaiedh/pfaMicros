package com.example.demandems.controller;

import com.example.demandems.dto.CreditDto;
import com.example.demandems.dto.ProjectDto;
import com.example.demandems.entities.Project;
import com.example.demandems.service.IProjectService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/projects")

public class ProjectController {

    @Autowired
    private IProjectService projectService;

    @PostMapping("/")
    public ProjectDto createProject(@RequestBody Project project)
    {
       return projectService.createProject(project);
    }


    @GetMapping("/")
    public ResponseEntity<List<ProjectDto>> getAllProject()
    {
        return ResponseEntity.ok(projectService.getAllProject());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto> getByIdProject(@PathVariable int id)
    {
        return ResponseEntity.ok(projectService.getByIdProject(id));
    }


    @PutMapping("/{id}")
    public ProjectDto updateProject(@PathVariable int id, @RequestBody Project project)
    {
        project.setIdProject(id);
        return projectService.updateProject(project,id);
    }



    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable int id)
    {
        projectService.deleteProject(id);
    }



}
