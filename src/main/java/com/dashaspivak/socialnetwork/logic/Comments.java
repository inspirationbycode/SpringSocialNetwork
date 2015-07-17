package com.dashaspivak.socialnetwork.logic;

import java.time.LocalDate;

public class Comments {
    private long id;
    private int id_user;
    private long id_post;
    private char description;
    private LocalDate date;

    public Comments(){}

    public void setId(long id){this.id = id;}

    public void setId_user(int id_user){this.id_user = id_user;}

    public void setId_post(long id_post){this.id_post = id_post;}

    public void setDescription(char description){this.description = description;}

    public void setDate(LocalDate date){this.date = date;}

    public long getId(){return id;}
    public int getId_user(){return id_user;}
    public long getId_post(){return id_post;}
    public char getDescription(){return description;}
    public LocalDate getDate(){return date;}
}
