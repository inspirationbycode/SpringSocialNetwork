package com.dashaspivak.socialnetwork.logic;

import java.time.LocalDate;

public class Post {
    private long id;
    private int id_user;
    private long id_photo;
    private char description;
    private LocalDate date;

    public Post() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_photo(long id_photo) {
        this.id_photo = id_photo;
    }

    public void setDescriptoin(char description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public long getId_photo() {
        return id_photo;
    }

    public char getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }
}
