package com.notechus.wshop.util.repository;

import com.google.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * @author notechus.
 */
public class GenericRepository<T, ID extends Serializable> implements Repository<T, ID> {

    private Session session;
    private Class<T> tClass;

    @Inject
    public GenericRepository(SessionFactory factory) {
        this.session = factory.openSession();
    }

    @Override
    public void create(T entity) {
        this.session.persist(entity);
    }

    @Override
    public void update(T entity) {
        this.session.merge(entity);
    }

    @Override
    public void delete(T entity) {
        this.session.delete(entity);
    }

    @Override
    public T findById(ID id) {
        return this.session.get(tClass, id);
    }

    @Override
    public List<T> findAll() {
        return this.session.createQuery("from " + tClass.getSimpleName()).getResultList();
    }
}
