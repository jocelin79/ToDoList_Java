package org.example;

import java.util.Comparator;

public class Task implements Comparable<Task> {
    String name;
    String description;
    String finalDate;
    int priority;
    String category;
    String status;

    public Task(String name, String description, String finalDate, Integer priority, String category, String status) {
        this.name = name;
        this.description = description;
        this.finalDate = finalDate;
        this.priority = priority;
        this.category = category;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", finalDate='" + finalDate + '\'' +
                ", priority=" + priority +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        if(this.priority < o.priority){
            return -1;
        } else if(this.priority > o.priority) {
            return 1;
        }
        return 0;
    }
}

class ComparatorCategory implements Comparator <Task>{

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getCategory().compareToIgnoreCase(o2.getCategory());
    }
}

class ComparatorStatus implements Comparator <Task>{

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getStatus().compareToIgnoreCase(o2.getStatus());
    }
}