package com.dashaspivak.socialnetwork.model;

import java.sql.Blob;
import java.util.Set;

public class Photo extends BaseEntity {
    private Blob name;
    private Set posts;
    private Set users;

    public Photo() {
    }

    public void setName(Blob name) {
        this.name = name;
    }
    public void setPosts(Set posts) {
        this.posts = posts;
    }
    public void setUsers(Set users) {
        this.users = users;
    }

    public Blob getName() {
        return name;
    }
    public Set getPosts() {
        return posts;
    }
    public Set getUsers() {
        return users;
    }
}
