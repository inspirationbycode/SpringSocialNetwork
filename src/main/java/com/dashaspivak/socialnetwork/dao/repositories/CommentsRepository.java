package com.dashaspivak.socialnetwork.dao.repositories;

import com.dashaspivak.socialnetwork.interfaces.repositories.ICommentsRepository;
import com.dashaspivak.socialnetwork.model.Comments;
import com.dashaspivak.socialnetwork.model.Post;
import org.hibernate.Session;

public class CommentsRepository<T extends Comments> extends Repository<T> implements ICommentsRepository<T>  {

    @Override
    public Iterable<Comments> GetCommentsByPostId(long id) {
        Session session = null;
        Iterable<Comments> entities = null;
        try {
            session = sessionFactory.openSession();
            entities = ((Post)session.load(Post.class, id)).getComments();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entities;
    }
}
