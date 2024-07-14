package com.example.demandems.service.serviceImp;

import com.example.demandems.dto.ProjectDto;
import com.example.demandems.entities.Project;
import com.example.demandems.mapper.IProjectMapper;
import com.example.demandems.repository.IProjectRepository;
import com.example.demandems.service.IProjectService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor


public class ProjectServiceImpl implements IProjectService {
    @Autowired
    private IProjectRepository projectRepository;
    @Autowired
    private  IProjectMapper projectMapper;


    @Override
    public List<ProjectDto> getAllProject() {
        List<Project> projects = projectRepository.findAll();
        return projectMapper.toDto(projects);
    }

    @Override
    public ProjectDto getByIdProject(int id) {
        Optional<Project> project = projectRepository.findById(id);
        if (project.isPresent())
        {
            return projectMapper.toDto(project.get());

        }else
        {
            System.out.println("Project not found");
            return null;
        }

    }

    @Override
    public ProjectDto createProject(Project project) {
        project= projectRepository.save(project);

        return projectMapper.toDto(project);
    }



    @Override
    public ProjectDto updateProject(Project project, int id) {
        if (!projectRepository.existsById(project.getIdProject()))
        {
            throw new RuntimeException("project not found");
        }
        project = projectRepository.save(project);
        return  projectMapper.toDto(project);
    }


    @Override
    public void deleteProject(int id) {
        projectRepository.deleteById(id);

    }
}
