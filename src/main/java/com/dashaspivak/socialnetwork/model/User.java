package com.dashaspivak.socialnetwork.model;

import java.util.Set;

public class User extends BaseEntity {
    private String first_name;
    private String last_name;
    private String phone_number;
    private long id_photo;
    private String email;
    private String password;
    private String password_salt;
    private boolean active;
    private Set posts;
    private Set comments;
    private Set userInRoles;
    private Set users;
    private Set friends;
    private Photo photo;


    public User() {
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

    public void setDataSource(org.springframework.jdbc.datasource.DriverManagerDataSource dataSource) {
    }

    public Set getPosts() {
        return posts;
    }

    public void setPosts(Set posts) {
        this.posts = posts;
    }

    public Set getComments() {
        return comments;
    }

    public void setComments(Set comments) {
        this.comments = comments;
    }

    public Set getUserInRoles() {
        return userInRoles;
    }

    public void setUserInRoles(Set userInRoles) {
        this.userInRoles = userInRoles;
    }

    public Set getUsers() {
        return users;
    }

    public void setUsers(Set users) {
        this.users = users;
    }

    public Set getFriends() {
        return friends;
    }

    public void setFriends(Set friends) {
        this.friends = friends;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
}

