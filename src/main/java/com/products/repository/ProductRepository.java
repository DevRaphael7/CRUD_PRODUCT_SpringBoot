package com.products.repository;

import java.util.List;

import com.products.models.entity.Product;
import com.products.models.entity.User;
import com.products.models.repository.ProductsRepositoryImp;

public class ProductRepository implements ProductsRepositoryImp {

    @Override
    public boolean addItem(Product item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Product> getAll(User usuario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getSigleValue(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean removeItem(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateItem(Product item) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
