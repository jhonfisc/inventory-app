package com.java.fundamentals.inventory.app.application.services;

import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.StoreNotFoundException;
import java.util.List;

/**
 *
 * @author capri
 */
public interface StoreServiceI {

    List<Store> findAll();
    Store findById(short storeId) throws StoreNotFoundException;
    Store update(Store storeToUpdate) throws StoreNotFoundException;
    void checkStores();
    String checkIfStoreHasValidName(Store storeToVerify);
}
