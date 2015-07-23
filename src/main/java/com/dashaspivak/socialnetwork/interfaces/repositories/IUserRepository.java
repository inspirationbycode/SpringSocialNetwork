package com.dashaspivak.socialnetwork.interfaces.repositories;

import com.dashaspivak.socialnetwork.model.User;

/**
 * Created by например on 20.07.2015.
 */
public interface IUserRepository<T extends User> extends IRepository<T> {
    User GetUserByIEmail(String Email);
    User GetUserByName(String lastName, String firstName);
}
