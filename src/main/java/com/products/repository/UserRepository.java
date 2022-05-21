package com.products.repository;

import java.io.Console;
import java.util.List;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
import com.products.models.entity.User;
import com.products.models.repository.UserRepositoryImp;
import com.products.models.response.ResponseHttp;
import com.products.querys.UserQuerys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements UserRepositoryImp {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public ResponseHttp<List<User>> loginUser(User user) {
        List<User> checkFoundUser = jdbcTemplate.query(UserQuerys.loginUserQuery(user), new BeanPropertyRowMapper(User.class));
        System.out.println(UserQuerys.loginUserQuery(user));

        if(checkFoundUser.isEmpty()){
            return new ResponseHttp<>("Usuário não encontrado", null, 200);
        }

        return new ResponseHttp<>(String.format("Usuário %s logado com sucesso!", checkFoundUser.get(0).getNameUser()), checkFoundUser, 200);
    }

    @Override
    public ResponseHttp<Empty> registerUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
