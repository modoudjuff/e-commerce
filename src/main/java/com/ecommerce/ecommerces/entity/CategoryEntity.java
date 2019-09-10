package com.ecommerce.ecommerces.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class CategoryEntity  implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nom;
    private String description;
    private String photoCategori;
    @OneToMany
    private Collection<CategoryEntity> categoryEntities;

    public CategoryEntity() {
    }

    public CategoryEntity(String nom, String description) {
        this.description=description;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public CategoryEntity setId(Long id) {
        this.id = id;
        return  this;
    }

    public String getPhotoCategori() {
        return photoCategori;
    }

    public CategoryEntity setPhotoCategori(String photoCategori) {
        this.photoCategori = photoCategori;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public CategoryEntity setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryEntity setDescription(String description) {
        this.description = description;
        return  this;
    }

    public Collection<CategoryEntity> getCategoryEntities() {
        return categoryEntities;
    }

    public CategoryEntity setCategoryEntities(Collection<CategoryEntity> categoryEntities) {
        this.categoryEntities = categoryEntities;
        return this;
    }
}
