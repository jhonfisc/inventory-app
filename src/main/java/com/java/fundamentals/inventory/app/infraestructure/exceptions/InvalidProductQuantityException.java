package com.java.fundamentals.inventory.app.infraestructure.exceptions;

public class InvalidProductQuantityException extends Exception {
    @Override
    public String getMessage() {
        return "Product Quantity Invalid";
    }
}
