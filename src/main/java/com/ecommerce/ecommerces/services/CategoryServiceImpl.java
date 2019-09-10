package com.ecommerce.ecommerces.services;

import com.ecommerce.ecommerces.entity.CategoryEntity;
import com.ecommerce.ecommerces.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements  CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void saveCategory(CategoryEntity c) {
        categoryRepository.save(new CategoryEntity("Cumputer",null));
        categoryRepository.save(new CategoryEntity("printer", null));
        categoryRepository.save(new CategoryEntity("voiture", null));

    }

}
