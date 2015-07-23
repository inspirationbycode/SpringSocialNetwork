package com.dashaspivak.socialnetwork.interfaces.repositories;

import com.dashaspivak.socialnetwork.model.BaseEntity;

import java.sql.SQLException;

public interface IRepository<T extends BaseEntity> {
    void Add(T entity) throws SQLException;
    void Delete(T entity) throws SQLException;
    void Update(T entity) throws SQLException;
    Iterable<T> GetAll(Class<T> type);
    T GetById(Class<T> type, long id);
}
