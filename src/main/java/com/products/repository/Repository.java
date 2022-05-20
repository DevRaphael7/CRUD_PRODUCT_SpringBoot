package com.products.repository;

import java.util.List;

import com.products.models.entity.User;
import com.products.models.repository.RepositoryImp;

public abstract class Repository<T> implements RepositoryImp<T> {

    @Override
    public boolean addItem(T item) {
        return false;
    }

    @Override
    public List<T> getAll(User usuario) {
        return null;
    }

    @Override
    public List<T> getSigleValue(int id) {
        return null;
    }

    @Override
    public boolean removeItem(int id) {
        return false;
    }

    @Override
    public boolean updateItem(T item) {
        return false;
    }
    
}
