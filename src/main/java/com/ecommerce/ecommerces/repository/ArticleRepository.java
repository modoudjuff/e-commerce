package com.ecommerce.ecommerces.repository;

import com.ecommerce.ecommerces.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {
}
