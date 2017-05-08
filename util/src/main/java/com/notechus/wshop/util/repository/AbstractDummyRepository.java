package com.notechus.wshop.util.repository;

import com.notechus.wshop.util.IEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * @author notechus.
 */
public abstract class AbstractDummyRepository<T extends IEntity<ID>, ID extends Serializable> implements Repository<T, ID> {

    private Map<ID, T> items = new Hashtable<>();

    @Override
    public void create(T entity) {
        items.put(entity.getId(), entity);
    }

    @Override
    public void update(T entity) {
        items.put(entity.getId(), entity);
    }

    @Override
    public void delete(T entity) {
        items.remove(entity.getId());
    }

    @Override
    public T findById(ID id) {
        return items.get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(items.values());
    }
}
