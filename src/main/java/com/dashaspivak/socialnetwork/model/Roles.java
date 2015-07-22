package com.dashaspivak.socialnetwork.model;

import java.util.Set;

public class Roles extends BaseEntity {
    private String name;
    private Set userInRoles;

    public Roles() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setUserInRoles(Set userInRoles) {
        this.userInRoles = userInRoles;
    }

    public String getName() {
        return name;
    }
    public Set getUserInRoles() {
        return userInRoles;
    }
}
