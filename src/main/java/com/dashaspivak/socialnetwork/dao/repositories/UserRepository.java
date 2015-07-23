package com.dashaspivak.socialnetwork.dao.repositories;

import com.dashaspivak.socialnetwork.interfaces.repositories.IUserRepository;
import com.dashaspivak.socialnetwork.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class UserRepository<T extends User> extends Repository<T> implements IUserRepository<T> {
    @Override
    public User GetUserByIEmail(String Email) {
        Session session = null;
        User entity = null;
        try {
            session = sessionFactory.openSession();
            Criteria cr = session.createCriteria(User.class);
            Criterion email = Restrictions.like("email", Email);
            cr.add(email);
            List<User> users = cr.list();
            for (int i = 0; i < users.size(); i++) {
                if(Email.equals(users.get(i)))
                    return users.get(i);
            }
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public User GetUserByName(String lastName, String firstName) {
        return null;
    }
}
