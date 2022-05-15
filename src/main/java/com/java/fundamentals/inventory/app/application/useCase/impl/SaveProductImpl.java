package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.domain.entities.Product;
import com.java.fundamentals.inventory.app.application.services.ProductServiceInterface;
import com.java.fundamentals.inventory.app.application.useCase.SaveProductInterface;

public class SaveProductImpl implements SaveProductInterface {

    private ProductServiceInterface productServiceInterface;

    public SaveProductImpl(ProductServiceInterface productServiceInterface) {
        this.productServiceInterface = productServiceInterface;
    }

    public void save(Product product) {

    }

}
