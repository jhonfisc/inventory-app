package com.java.fundamentals.inventory.app.application.useCase.impl;

import com.java.fundamentals.inventory.app.application.InventoryApp;
import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.StoreNotFoundException;
import com.java.fundamentals.inventory.app.application.services.StoreServiceI;
import com.java.fundamentals.inventory.app.application.useCase.UpdateStoreInterface;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateStoreImpl implements UpdateStoreInterface {

    private StoreServiceI storeServiceI;

    public UpdateStoreImpl(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;
    }

    @Override
    public boolean update(Store store) {
        try {
            var updatedStore = this.storeServiceI.update(store);
            System.out.println("La tienda modificada es: " + updatedStore);
        } catch(StoreNotFoundException storeNotFoundException) {
            Logger.getLogger(InventoryApp.class.getName()).log(Level.SEVERE, null, storeNotFoundException);
            return false;
        }
        return true;
    }
}
