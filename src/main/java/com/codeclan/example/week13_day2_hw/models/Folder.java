package com.codeclan.example.week13_day2_hw.models;

import java.util.List;

public class Folder {

    private String titles;
    private List<File> file;
    private User user;

    public Folder(String titles, List<File> file, User user) {
        this.titles = titles;
        this.file = file;
        this.user = user;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public List<File> getFile() {
        return file;
    }

    public void setFile(List<File> file) {
        this.file = file;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
