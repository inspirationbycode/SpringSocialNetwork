package com.dashaspivak.socialnetwork.dao.repositories;

import com.dashaspivak.socialnetwork.interfaces.IFriendsRepository;
import com.dashaspivak.socialnetwork.model.Friends;
import com.dashaspivak.socialnetwork.model.User;
import org.hibernate.Session;

public class FriendsRepository<T extends Friends> extends Repository<T> implements IFriendsRepository<T> {

    @Override
    public Iterable<Friends> GetFriendsListById(long id) {
        Session session = null;
        Iterable<Friends> entities = null;
        try {
            session = sessionFactory.openSession();
            entities = ((User)session.load(User.class, id)).getFriends();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entities;
    }
}
