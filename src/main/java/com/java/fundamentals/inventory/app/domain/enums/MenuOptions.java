package com.java.fundamentals.inventory.app.domain.enums;

public enum MenuOptions {
    OPTION_1("findAllStores"),
    OPTION_2("findStoreById"),
    OPTION_3("updateStore"),
    OPTION_4("showProductList"),
    OPTION_5("getProductsGreaterThan"),
    OPTION_6("getProductsLessThan"),
    OPTION_7("getProductsByName");

    private final String option;

    private MenuOptions(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
