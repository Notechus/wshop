package com.notechus.wshop.util.repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author notechus.
 */
public interface Repository<T, ID extends Serializable> {

    void create(T entity);

    void update(T entity);

    void delete(T entity);

    T findById(ID id);

    List<T> findAll();
}
