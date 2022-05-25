package com.java.fundamentals.inventory.app.infraestructure.repository;

import com.java.fundamentals.inventory.app.domain.entities.Product;

import java.util.List;

public interface ProductRepositoryInterface {

    public Product create(Product product);

    public List<Product> findAll();
}
