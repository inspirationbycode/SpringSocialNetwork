package com.dashaspivak.socialnetwork.interfaces;

import com.dashaspivak.socialnetwork.model.Roles;

/**
 * Created by например on 20.07.2015.
 */
public interface IRolesRepository<T extends Roles> extends IRepository<T> {
    Roles GetRoleByName(String name);
}
