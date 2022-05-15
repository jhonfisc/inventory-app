package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.application.services.StoreServiceI;
import com.java.fundamentals.inventory.app.application.useCase.NewStoreInterface;

public class NewStoreImpl implements NewStoreInterface {

    private StoreServiceI storeServiceI;

    public NewStoreImpl(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;
    }

    @Override
    public Store create(short id, String name, String address) {
        Store store = new Store(id, name, address);
        return store;
    }
}
