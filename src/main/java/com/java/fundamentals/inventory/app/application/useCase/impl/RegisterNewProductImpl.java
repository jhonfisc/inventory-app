package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.application.services.ProductServiceInterface;
import com.java.fundamentals.inventory.app.domain.entities.Product;
import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.application.useCase.RegisterNewProductInterface;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.InvalidMeasureUnitException;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.InvalidProductQuantityException;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.java.fundamentals.inventory.app.domain.enums.MeasureUnits.GRS;

public class RegisterNewProductImpl implements RegisterNewProductInterface {

    private Product newProduct = new Product();
    private ProductServiceInterface productServiceInterface;
    public RegisterNewProductImpl(ProductServiceInterface productServiceInterface) {
        this.productServiceInterface = productServiceInterface;
    }

    @Override
    public void create(Store store) {
        newProduct.setId((short) 1);
        newProduct.setCurrentQuantity(10_000);
        newProduct.setName("Cafe");
        newProduct.setMeasureUnit(GRS.toString());
        newProduct.setMinQuantity(1_000);
        this.setStore(store);
        this.register();
    }

    private void register() {
        try {
            productServiceInterface.register(newProduct);
        } catch (InvalidMeasureUnitException ex) {
            Logger.getLogger(RegisterNewProductImpl.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } catch (InvalidProductQuantityException ex) {
            Logger.getLogger(RegisterNewProductImpl.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    private void setStore(Store store) {
        newProduct.setStore(store);
    }
}
