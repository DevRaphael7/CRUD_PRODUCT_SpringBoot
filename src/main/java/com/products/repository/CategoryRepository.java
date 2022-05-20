package com.products.repository;

import java.util.List;

import com.products.models.entity.Category;
import com.products.models.entity.User;
import com.products.models.repository.CategoryRepositoryImp;

public class CategoryRepository implements CategoryRepositoryImp {

    @Override
    public boolean addItem(Category item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Category> getAll(User usuario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Category> getSigleValue(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean removeItem(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateItem(Category item) {
        // TODO Auto-generated method stub
        return false;
    }
        
}
