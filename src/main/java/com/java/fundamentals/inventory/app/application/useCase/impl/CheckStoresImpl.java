package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.application.services.StoreServiceI;
import com.java.fundamentals.inventory.app.application.useCase.CheckStoresInterface;

public class CheckStoresImpl implements CheckStoresInterface {

    private StoreServiceI storeServiceI;

    public CheckStoresImpl(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;
    }

    @Override
    public void check() {
        storeServiceI.checkStores();
    }
}
