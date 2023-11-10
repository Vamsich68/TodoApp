package com.WebApp.ToDoApp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
@Entity
public class ToDo {
    public ToDo(){

    }
    @Id
    @GeneratedValue
    private int id;
    private String username;

    private  String description;
    private LocalDate targetdate;
    private boolean done;

    public ToDo(int id, String username, String description, LocalDate targetdate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetdate = targetdate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTargetdate() {
        return targetdate;
    }

    public boolean isDone() {
        return done;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetdate(LocalDate targetdate) {
        this.targetdate = targetdate;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "Id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetdate='" + targetdate + '\'' +
                ", done=" + done +
                '}';
    }
}
