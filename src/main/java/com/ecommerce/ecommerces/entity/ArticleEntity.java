package com.ecommerce.ecommerces.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ArticleEntity implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private String photo;
    private boolean available;
    private  boolean selected;
    private  boolean isPromotion;
    private  double prixUnitaire;
    @ManyToOne
    private CategoryEntity categoryEntity;

    public ArticleEntity() {
    }

    public Long getId() {
        return id;
    }

    public ArticleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public ArticleEntity setNom(String nom) {
        this.nom = nom;
        return  this;
    }

    public String getDescription() {
        return description;
    }

    public ArticleEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ArticleEntity setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public boolean isAvailable() {
        return available;
    }

    public ArticleEntity setAvailable(boolean available) {
        this.available = available;
        return this;
    }

    public boolean isSelected() {
        return selected;
    }

    public ArticleEntity setSelected(boolean selected) {
        this.selected = selected;
        return  this;
    }

    public boolean isPromotion() {
        return isPromotion;
    }

    public ArticleEntity setPromotion(boolean promotion) {
        isPromotion = promotion;
        return this;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public ArticleEntity setCategory(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
        return this;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public ArticleEntity setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
        return  this;
    }
}
