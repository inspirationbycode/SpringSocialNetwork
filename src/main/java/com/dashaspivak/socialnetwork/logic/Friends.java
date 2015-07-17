package com.dashaspivak.socialnetwork.logic;

public class Friends {
    private long id;
    private int id_user;
    private int id_friend;

    public Friends() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_friend(int id_friend) {
        this.id_friend = id_friend;
    }

    public long getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_friend() {
        return id_friend;
    }
}
