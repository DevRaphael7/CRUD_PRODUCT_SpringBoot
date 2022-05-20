package com.products.models.repository;

import java.util.List;
import com.products.models.entity.User;

public interface RepositoryImp<T> {

    public List<T> getAll(User usuario);
    public List<T> getSigleValue(int id);
    public boolean addItem(T item);
    public boolean updateItem(T item);
    public boolean removeItem(int id);
      
}
