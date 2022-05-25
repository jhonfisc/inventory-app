package com.java.fundamentals.inventory.app.infraestructure.exceptions;

public class InvalidMeasureUnitException extends Exception {

    @Override
    public String getMessage() {
        return "Measure Unit Invalid";
    }
}
