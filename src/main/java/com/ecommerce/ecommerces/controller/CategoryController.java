package com.ecommerce.ecommerces.controller;

import com.ecommerce.ecommerces.entity.CategoryEntity;
import com.ecommerce.ecommerces.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/save")
    public void saveCategory(CategoryEntity c){
        categoryService.saveCategory(c);
    }

}
