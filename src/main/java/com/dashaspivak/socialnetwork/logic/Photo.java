package com.dashaspivak.socialnetwork.logic;

import java.sql.Blob;

public class Photo {
    private long id;
    private Blob name;

    public Photo() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(Blob name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public Blob getName() {
        return name;
    }
}
