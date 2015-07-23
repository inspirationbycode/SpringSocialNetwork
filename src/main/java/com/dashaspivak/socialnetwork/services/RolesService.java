package com.dashaspivak.socialnetwork.services;

import com.dashaspivak.socialnetwork.dao.repositories.RolesRepository;
import com.dashaspivak.socialnetwork.dao.repositories.UserInRolesRepository;
import com.dashaspivak.socialnetwork.interfaces.repositories.IRolesRepository;
import com.dashaspivak.socialnetwork.interfaces.repositories.IUserInRolesRepository;
import com.dashaspivak.socialnetwork.model.Roles;
import com.dashaspivak.socialnetwork.model.User;
import com.dashaspivak.socialnetwork.model.User_in_roles;

import java.sql.SQLException;


public class RolesService {
    private static IUserInRolesRepository<User_in_roles> rolesInRolesRepository;
    private static IRolesRepository<Roles> rolesRepository;

    static {
        rolesInRolesRepository = new UserInRolesRepository<>();
        rolesRepository = new RolesRepository<>();
    }

    public void SetRole(User user) throws SQLException {
        User_in_roles role = new User_in_roles();
        role.setId_role(2);
        role.setId_user(user.getId());
        try {
            rolesInRolesRepository.Add(role);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
