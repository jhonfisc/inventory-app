package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.application.InventoryApp;
import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.StoreNotFoundException;
import com.java.fundamentals.inventory.app.application.services.StoreServiceI;
import com.java.fundamentals.inventory.app.application.useCase.FindStoreByIdInterface;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FindStoreByIdImpl implements FindStoreByIdInterface {

    private StoreServiceI storeServiceI;

    public FindStoreByIdImpl(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;
    }

    @Override
    public void search(short id) {
        Store foundStore;
        try {
            foundStore = this.storeServiceI.findById(id);
            System.out.println("La información de la tienda es: " + foundStore.toString());
        } catch (StoreNotFoundException ex) {
            Logger.getLogger(InventoryApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
