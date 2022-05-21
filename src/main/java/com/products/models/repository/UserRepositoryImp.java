package com.products.models.repository;

import java.util.List;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
import com.products.models.entity.User;
import com.products.models.response.ResponseHttp;

public interface UserRepositoryImp {

    public ResponseHttp<List<User>> loginUser(User user);
    public ResponseHttp<Empty> registerUser(User user);
    
}
