package com.dashaspivak.socialnetwork.model;

import java.time.LocalDate;

public class Comments extends BaseEntity {
    private long id_user;
    private long id_post;
    private String description;
    private LocalDate date;

    public Comments(){}

    public void setId_user(long id_user){this.id_user = id_user;}

    public void setId_post(long id_post){this.id_post = id_post;}

    public void setDescription(String description){this.description = description;}

    public void setDate(LocalDate date){this.date = date;}

    public long getId_user(){return id_user;}
    public long getId_post(){return id_post;}
    public String getDescription(){return description;}
    public LocalDate getDate(){return date;}
}
