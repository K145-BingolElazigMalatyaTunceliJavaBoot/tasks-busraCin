package com.example.toDoList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class toDoItem {
    private int id;

    private String title;
    private boolean done;

    public toDoItem() {
    }

    public toDoItem(int id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }


    @Id
    @GeneratedValue


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
