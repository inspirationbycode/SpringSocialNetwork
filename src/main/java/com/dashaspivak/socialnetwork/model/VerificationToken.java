package com.dashaspivak.socialnetwork.model;

public class VerificationToken extends BaseEntity {
    private String token;

    public VerificationToken(){    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
