package com.dashaspivak.socialnetwork.model;

import java.time.LocalDate;
import java.util.Set;

public class Post extends BaseEntity {
    private long id_user;
    private long id_photo;
    private String description;
    private LocalDate date;
    private Set comments;

    public Post() {
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public void setId_photo(long id_photo) {
        this.id_photo = id_photo;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setComments(Set comments) {
        this.comments = comments;
    }

    public long getId_user() {
        return id_user;
    }

    public long getId_photo() {
        return id_photo;
    }


    public LocalDate getDate() {
        return date;
    }

    public Set getComments() {
        return comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
