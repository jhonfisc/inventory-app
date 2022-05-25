package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.application.services.ProductServiceInterface;
import com.java.fundamentals.inventory.app.application.useCase.GetProductsGreaterThanInterface;

public class GetProductsGreaterThanImpl implements GetProductsGreaterThanInterface {

    private final ProductServiceInterface productServiceInterface;

    public GetProductsGreaterThanImpl(ProductServiceInterface productServiceInterface) {
        this.productServiceInterface = productServiceInterface;
    }

    @Override
    public void get(int limit) {
        productServiceInterface.findAll().stream().filter(
                product -> product.getCurrentQuantity() > limit
        ).forEach(System.out::println);
    }
}
