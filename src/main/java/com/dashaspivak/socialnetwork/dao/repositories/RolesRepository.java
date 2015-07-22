package com.dashaspivak.socialnetwork.dao.repositories;

import com.dashaspivak.socialnetwork.interfaces.IRolesRepository;
import com.dashaspivak.socialnetwork.model.Roles;

public class RolesRepository<T extends Roles> extends Repository<T> implements IRolesRepository<T> {
    @Override
    public Roles GetRoleByName(String name) {
        return null;
    }
}
