package com.bookShop.dao;

public interface CrudRepository<T> {

    void add(T entity);

    void update(T entity);

    void remove(T entity);

}
