package com.java.fundamentals.inventory.app.application.services.impl;

import com.java.fundamentals.inventory.app.application.services.ProductServiceInterface;
import com.java.fundamentals.inventory.app.domain.entities.Product;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.InvalidMeasureUnitException;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.InvalidProductQuantityException;
import com.java.fundamentals.inventory.app.infraestructure.repository.ProductRepositoryInterface;

import java.util.List;

public class ProductServiceImpl implements ProductServiceInterface {

    private ProductRepositoryInterface productRepositoryInterface;

    public ProductServiceImpl(ProductRepositoryInterface productRepositoryInterface) {
        this.productRepositoryInterface = productRepositoryInterface;
    }

    @Override
    public void register(Product product) throws InvalidMeasureUnitException, InvalidProductQuantityException {
        if (product != null && product.getMeasureUnit() != null) {
            if (product.getCurrentQuantity() > 1000) {
                productRepositoryInterface.create(product);
            } else {
                throw new InvalidProductQuantityException();
            }
        } else {
            throw new InvalidMeasureUnitException();
        }
    }

    @Override
    public List<Product> findAll() {
        return productRepositoryInterface.findAll();
    }
}
