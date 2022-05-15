package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.application.services.StoreServiceI;
import com.java.fundamentals.inventory.app.application.useCase.FindAllStoresInterface;

import java.util.List;

public class FindAllStoresImpl implements FindAllStoresInterface {

    private StoreServiceI storeServiceI;
    public FindAllStoresImpl(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;
    }


    @Override
    public void search() {
        List<Store> foundStores = this.storeServiceI.findAll();

        for (Store foundStore : foundStores) {
            System.out.println("La tienda encontrada es: " + foundStore);
        }
    }
}
