package com.ecommerce.ecommerces.services;

import java.util.List;
import com.ecommerce.ecommerces.entity.ArticleEntity;

public interface ArticleService {
    void saveArticle(ArticleEntity articleEntity);
    List<ArticleEntity> listAll();
    ArticleEntity getArticleById(Long id);
    void deleteArticle(Long id);
}
