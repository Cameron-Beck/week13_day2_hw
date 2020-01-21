package com.codeclan.example.week13_day2_hw.models;

import java.util.List;

public class User {

    private String name;
    private List<Folder> folder;

    public User(String name, List<Folder> folder) {
        this.name = name;
        this.folder = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolder() {
        return folder;
    }

    public void setFolder(List<Folder> folder) {
        this.folder = folder;
    }
}
