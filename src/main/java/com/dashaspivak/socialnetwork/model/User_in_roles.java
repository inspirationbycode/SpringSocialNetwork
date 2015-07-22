package com.dashaspivak.socialnetwork.model;

public class User_in_roles extends BaseEntity {
    private long id_user;
    private long id_role;
    private User user;
    private Roles role;

    public User_in_roles() {
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public void setId_role(long id_role) {
        this.id_role = id_role;
    }

    public long getId_user() {
        return id_user;
    }

    public long getId_role() {
        return id_role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
