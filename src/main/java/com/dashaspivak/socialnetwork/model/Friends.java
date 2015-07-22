package com.dashaspivak.socialnetwork.model;

public class Friends extends BaseEntity {
    private long id_user;
    private long id_friend;

    public Friends() {
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public void setId_friend(long id_friend) {
        this.id_friend = id_friend;
    }

    public long getId_user() {
        return id_user;
    }

    public long getId_friend() {
        return id_friend;
    }
}
