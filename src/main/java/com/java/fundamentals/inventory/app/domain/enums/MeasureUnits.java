package com.java.fundamentals.inventory.app.domain.enums;

public enum MeasureUnits {
    GRS("Gramos");

    private String units;

    private MeasureUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return units;
    }
}
