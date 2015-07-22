package com.dashaspivak.socialnetwork.dao.repositories;

import com.dashaspivak.socialnetwork.interfaces.IUserInRolesRepository;
import com.dashaspivak.socialnetwork.model.User_in_roles;

public class UserInRolesRepository<T extends User_in_roles> extends Repository<T> implements IUserInRolesRepository<T> {
}
