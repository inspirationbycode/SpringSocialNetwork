package com.dashaspivak.socialnetwork.logic;

public class User {
    private int id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private long id_photo;
    private String email;
    private String password;
    private String password_salt;
    private boolean active;

    public User() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setId_photo(long id_photo) {
        this.id_photo = id_photo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public long getId_photo() {
        return id_photo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPassword_salt() {
        return password_salt;
    }

    public boolean isActive() {
        return active;
    }
}

