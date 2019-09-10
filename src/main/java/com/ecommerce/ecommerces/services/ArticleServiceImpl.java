package com.ecommerce.ecommerces.services;

import com.ecommerce.ecommerces.entity.ArticleEntity;
import com.ecommerce.ecommerces.repository.ArticleRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.nio.file.Files;
import java.util.List;


@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;




    @Override
    public void saveArticle(ArticleEntity articleEntity) {
        articleRepository.save(articleEntity);
        }

    @Override
    public List<ArticleEntity> listAll() {
        return articleRepository.findAll();
    }

    @Override
    public ArticleEntity getArticleById(Long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public void deleteArticle(Long id){
        articleRepository.deleteById(id);
    }

}
