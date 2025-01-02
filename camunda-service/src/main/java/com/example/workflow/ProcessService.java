package com.example.workflow;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProcessService {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    public void startProcessWithVariables(StartProcessRequest startProcessRequest) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("assignee",startProcessRequest.getUserTosend());
        variables.put("DemandeValue",startProcessRequest.getDemandeId());
        variables.put("candidateGroups", "BNA");
        variables.put("Datesaisie", "2024-08-12T10:00:00");

        runtimeService.startProcessInstanceByKey("demande", variables);
    }
    public List<TaskDto> getTasksByTaskDefinitionKeyAndAssignee(String taskDefinitionKey , String assignee){
        List<Task> tasks = taskService.createTaskQuery()
                .taskDefinitionKey(taskDefinitionKey)
                .taskAssignee(assignee)
                .list();

        List<TaskDto> taskDtos = tasks.stream().map(task -> {
            String demandeId = null;

            Map<String, Object> processVariables = runtimeService.getVariables(task.getProcessInstanceId());

            if (processVariables != null) {
                if (processVariables.containsKey("demandeId")) {
                    demandeId = String.valueOf(processVariables.get("demandeId"));
                }
                else if (processVariables.containsKey("DemandeValue")) {
                    demandeId = String.valueOf(processVariables.get("DemandeValue"));
                }
            }

            return new TaskDto(
                    task.getId(),
                    task.getName(),
                    task.getProcessInstanceId(),
                    task.getAssignee(),
                    task.getCreateTime(),
                    demandeId
            );
        }).collect(Collectors.toList());

        return taskDtos;
    }

    public void completeTask(@RequestBody CompleteTaskRequest request) {

        Map<String, Object> variables = new HashMap<>();
        if(request.getRole()!=null){
            if(request.getRole().equals("verficateur")){
                variables.put("assignee", Variables.stringValue(request.getAssignee()));
                variables.put("UserTosendValue", Variables.stringValue(request.getUserTosend()));
                variables.put("demandeId", Variables.stringValue(request.getDemandeId()));
                variables.put("Datesaisie", Variables.stringValue(request.getDateSaisie()));
            }
            else if (request.getRole().equals("validateur")){
                variables.put("assignee", Variables.stringValue(request.getAssignee()));
                variables.put("UserTosendValue", Variables.stringValue(request.getUserTosend()));
                variables.put("demandeId", Variables.stringValue(request.getDemandeId()));
                variables.put("Datemodif", Variables.stringValue(request.getDatemodif()));

            }
        }
        if(request.getDecision() !=null ){
            if (request.getDecision().equals("nonvalidee")) {
                variables.put("decision", Variables.stringValue(request.getDecision()));
                variables.put("assignee", Variables.stringValue(request.getAssignee()));
                variables.put("UserTosendValue", Variables.stringValue(request.getUserTosend()));
                variables.put("motifRejet", Variables.stringValue(request.getMotifrejet()));
                variables.put("Datevalid", Variables.stringValue(request.getDatevalid()));
            }
            else{
                variables.put("decision", Variables.stringValue(request.getDecision()));
            }
        }

        taskService.complete(request.getTaskId(), variables);
    }

}
