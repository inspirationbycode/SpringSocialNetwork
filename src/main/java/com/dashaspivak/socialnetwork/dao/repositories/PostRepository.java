package com.dashaspivak.socialnetwork.dao.repositories;

import com.dashaspivak.socialnetwork.interfaces.IPostRepository;
import com.dashaspivak.socialnetwork.model.Post;
import com.dashaspivak.socialnetwork.model.User;
import org.hibernate.Session;

public class PostRepository<T extends Post> extends Repository<T> implements IPostRepository<T> {
    @Override
    public Iterable<Post> GetUserPostsById(long id) {
        Session session = null;
        Iterable<Post> entities = null;
        try {
            session = sessionFactory.openSession();
            entities = ((User)session.load(User.class, id)).getPosts();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entities;
    }

    @Override
    public Post GetPostById(long id) {
        Session session = null;
        Post entity = null;
        try {
            session = sessionFactory.openSession();
            entity = (Post)session.load(Post.class, id);
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entity;
    }
}
