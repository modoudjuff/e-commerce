package com.ecommerce.ecommerces.repository;

import com.ecommerce.ecommerces.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
