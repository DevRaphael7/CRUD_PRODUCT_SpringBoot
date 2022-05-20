package com.products.repository;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
import com.products.models.entity.User;
import com.products.models.repository.UserRepositoryImp;
import com.products.models.response.ResponseHttp;

public class UserRepository implements UserRepositoryImp {

    @Override
    public ResponseHttp<User> loginUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseHttp<Empty> registerUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
