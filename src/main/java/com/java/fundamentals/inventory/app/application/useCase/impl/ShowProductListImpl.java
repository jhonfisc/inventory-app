package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.application.services.ProductServiceInterface;
import com.java.fundamentals.inventory.app.application.useCase.ShowProductListInterface;
import com.java.fundamentals.inventory.app.domain.entities.Product;

public class ShowProductListImpl implements ShowProductListInterface {

    private ProductServiceInterface productServiceInterface;

    public ShowProductListImpl(ProductServiceInterface productServiceInterface) {
        this.productServiceInterface = productServiceInterface;
    }

    @Override
    public void show() {
        for (Product product : productServiceInterface.findAll()) {
            System.out.println(product);
        }
    }
}
