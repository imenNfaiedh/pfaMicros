package com.example.workflow;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompleteTaskRequest {

    private String taskId;
    private String assignee;
    private String userTosend;
    private String demandeId;
    private String dateSaisie;
    private String role;
    private String motifrejet;
    private String datevalid;
    private String datemodif;
    private String decision;
}
