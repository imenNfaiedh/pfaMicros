package com.example.workflow;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/process")
public class ProcessController {

    private final ProcessService processService;


    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @PostMapping("/start")
    public String startProcess(@RequestBody StartProcessRequest  startProcessRequest ) {
        processService.startProcessWithVariables(startProcessRequest);
        return "Process started";
    }

    @GetMapping("/by-task-and-assignee")
    public ResponseEntity<List<TaskDto>> getTasksByTaskDefinitionKeyAndAssignee(
            @RequestParam("taskDefinitionKey") String taskDefinitionKey,
            @RequestParam("assignee") String assignee) {
        return ResponseEntity.ok( processService.getTasksByTaskDefinitionKeyAndAssignee(taskDefinitionKey , assignee));
    }

    @PostMapping("/complete-task")
    public ResponseEntity<String> completeTask(@RequestBody CompleteTaskRequest request) {
        processService.completeTask(request);
        return ResponseEntity.ok("Task completed successfully.");
    }
}