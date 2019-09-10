package com.ecommerce.ecommerces.controller;

import com.ecommerce.ecommerces.entity.ArticleEntity;
import com.ecommerce.ecommerces.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/articles/{id}")
    public  ArticleEntity getArticleById(@PathVariable(value = "id") Long id){
        return  articleService.getArticleById(id);
    }
    @PostMapping("/save")
    public void saveArticle(@RequestBody ArticleEntity articleEntity)
    {
        articleService.saveArticle(articleEntity);
    }

    @GetMapping( "/getAll")
    public List<ArticleEntity> getAll(){
        return articleService.listAll();
    }

    @GetMapping("/delete/{id}")
    public String deleteArticle(@PathVariable(value = "id") Long id){
        articleService.deleteArticle(id);
        return "delete success id= "+id;
    }

}
