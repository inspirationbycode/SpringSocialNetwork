package com.dashaspivak.socialnetwork.dao.repositories;

import com.dashaspivak.socialnetwork.dao.HibernateUtil;
import com.dashaspivak.socialnetwork.interfaces.IRepository;
import com.dashaspivak.socialnetwork.model.BaseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class Repository<T extends BaseEntity> implements IRepository<T> {
    protected static SessionFactory sessionFactory;

    static {
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void Add(T entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = this.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        }
        catch (Exception ex){
            transaction.rollback();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void Delete(T entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = this.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        }
        catch (Exception ex){
            transaction.rollback();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void Update(T entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = this.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        }
        catch (Exception ex){
            transaction.rollback();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Iterable<T> GetAll(Class<T> type) {
        Session session = null;
        List<T> entities = null;
        try {
            session = this.sessionFactory.openSession();
            entities = session.createCriteria(type).list();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entities;
    }

    @Override
    public T GetById(Class<T> type, long id) {
        Session session = null;
        T entity = null;
        try {
            session = this.sessionFactory.openSession();
            entity = (T) session.load(type, id);

        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entity;
    }
}
