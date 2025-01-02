package com.example.workflow;

import java.util.Date;

public class TaskDto {

    private String taskId;
    private String taskName;
    private String processInstanceId;
    private String assignee;
    private String demandeId;
    private Date createTime;

    // Constructor, Getters, and Setters
    public TaskDto(String taskId, String taskName, String processInstanceId, String assignee, Date createTime , String demandeId) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.processInstanceId = processInstanceId;
        this.assignee = assignee;
        this.createTime = createTime;
        this.demandeId = demandeId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDemandeId() {
        return demandeId;
    }

    public void setDemandeId(String demandeId) {
        this.demandeId = demandeId;
    }
}