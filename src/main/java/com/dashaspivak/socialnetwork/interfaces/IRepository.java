package com.dashaspivak.socialnetwork.interfaces;

import com.dashaspivak.socialnetwork.model.BaseEntity;

public interface IRepository<T extends BaseEntity> {
    void Add(T entity);
    void Delete(T entity);
    void Update(T entity);
    Iterable<T> GetAll(Class<T> type);
    T GetById(Class<T> type, long id);
}
