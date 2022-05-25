package com.java.fundamentals.inventory.app.domain.enums;

public enum MeasureUnits {
    GRS("Gramos","01", "g"),
    LT("Litros","02", "l"),
    UT("Unidad","03", "und"),
    OZ("Onzas", "04", "oz");

    private final String name;
    private final String code;
    private final String symbol;

    private MeasureUnits(String name, String code, String symbol) {
        this.name = name;
        this.code = code;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }
}
