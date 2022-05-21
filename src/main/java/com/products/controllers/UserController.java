package com.products.controllers;

import java.util.List;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
import com.products.models.entity.User;
import com.products.models.response.ResponseHttp;
import com.products.repository.UserRepository;
import com.products.routes.UserRoutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserRoutes.controllerRoute)
public class UserController {

    @Autowired
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = UserRoutes.loginUser)
    public ResponseHttp<List<User>> loginUser(@RequestBody User user){
        return repository.loginUser(user);
    }
    
    
}
