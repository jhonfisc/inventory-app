package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.domain.entities.Product;
import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.application.useCase.RegisterNewProductInterface;

import static com.java.fundamentals.inventory.app.domain.enums.MeasureUnits.GRS;

public class RegisterNewProductImpl implements RegisterNewProductInterface {

    private Product newProduct = new Product();

    @Override
    public void create(Store store) {
        newProduct.setId((short) 1);
        newProduct.setCurrentQuantity(10_000);
        newProduct.setName("Cafe");
        newProduct.setMeasureUnit(GRS.toString());
        newProduct.setMinQuantity(1_000);
        this.setStore(store);
    }

    private void setStore(Store store) {
        newProduct.setStore(store);
    }
}
