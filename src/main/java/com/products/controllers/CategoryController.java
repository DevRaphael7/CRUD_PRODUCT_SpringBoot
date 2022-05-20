package com.products.controllers;

import com.products.routes.CategoryRoutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CategoryRoutes.controllerRoute)
public class CategoryController {

    public CategoryController(){}

    @GetMapping(CategoryRoutes.getAllCategory)
    public String getAllCategorys(){
        return "Teste";
    }
    
}
