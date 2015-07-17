package com.dashaspivak.socialnetwork.logic;

public class User_in_roles {
    private int id;
    private int id_user;
    private int id_role;

    public User_in_roles() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public int getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_role() {
        return id_role;
    }
}
