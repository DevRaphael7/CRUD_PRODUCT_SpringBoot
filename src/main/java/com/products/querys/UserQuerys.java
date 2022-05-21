package com.products.querys;

import com.products.models.entity.User;

public class UserQuerys {
    
    public final static String loginUserQuery(User user){
        return String.format("SELECT * FROM users WHERE nameUser = '%s' && passwordUser = '%s'", user.getNameUser(), user.getPasswordUser());
    }
}
