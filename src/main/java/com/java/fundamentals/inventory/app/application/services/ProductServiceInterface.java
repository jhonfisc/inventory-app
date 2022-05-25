package com.java.fundamentals.inventory.app.application.services;

import com.java.fundamentals.inventory.app.domain.entities.Product;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.InvalidMeasureUnitException;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.InvalidProductQuantityException;

import java.util.List;

public interface ProductServiceInterface {
    public void register(Product product) throws InvalidMeasureUnitException, InvalidProductQuantityException;
    public List<Product> findAll();
}
