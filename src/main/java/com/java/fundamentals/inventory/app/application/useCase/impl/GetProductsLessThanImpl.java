package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.application.services.ProductServiceInterface;
import com.java.fundamentals.inventory.app.application.useCase.GetProductsLessThanInterface;

public class GetProductsLessThanImpl implements GetProductsLessThanInterface {
    private final ProductServiceInterface productServiceInterface;

    public GetProductsLessThanImpl(ProductServiceInterface productServiceInterface) {
        this.productServiceInterface = productServiceInterface;
    }

    @Override
    public void get(int limit) {
        productServiceInterface.findAll().stream().filter(
                product -> product.getCurrentQuantity() < limit
        ).forEach(System.out::println);
    }
}
