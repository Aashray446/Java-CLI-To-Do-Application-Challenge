package models;

import java.io.Serializable;

public class Task implements Serializable {
    private String description;
    private String status;
    private String deadline;
    private int priority;

    public Task(String description, String status, String deadline, int priority) {
        this.description = description;
        this.status = status;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task [Description=" + description + ", Status=" + status + ", Deadline=" + deadline + ", Priority=" + priority + "]";
    }
}
