package com.java.fundamentals.inventory.app;

import com.java.fundamentals.inventory.app.application.InventoryApp;
import com.java.fundamentals.inventory.app.application.useCase.*;
import com.java.fundamentals.inventory.app.application.useCase.impl.*;
import com.java.fundamentals.inventory.app.infraestructure.repository.StoreRepositoryI;
import com.java.fundamentals.inventory.app.infraestructure.repository.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventory.app.application.services.StoreServiceI;
import com.java.fundamentals.inventory.app.application.services.impl.StoreServiceImpl;
import com.java.fundamentals.inventory.app.application.impl.*;

public class Main {
    public static void main(String[] args) {
        StoreRepositoryI storeRepositoryI = new StoreRepositoryImpl();
        StoreServiceI storeServiceI = new StoreServiceImpl(storeRepositoryI);
        CheckStoresInterface checkStoresInterface = new CheckStoresImpl(storeServiceI);
        NewStoreInterface newStoreInterface = new NewStoreImpl(storeServiceI);
        RegisterNewProductInterface registerNewProductInterface = new RegisterNewProductImpl();
        UpdateStoreInterface updateStoreInterface = new UpdateStoreImpl(storeServiceI);
        FindStoreByIdInterface findStoreByIdInterface = new FindStoreByIdImpl(storeServiceI);
        FindAllStoresInterface findAllStoresInterface = new FindAllStoresImpl(storeServiceI);
        InventoryApp inventoryApp =
                new InventoryApp(checkStoresInterface,
                                newStoreInterface,
                                registerNewProductInterface,
                                updateStoreInterface,
                                findStoreByIdInterface,
                                findAllStoresInterface
                );
        inventoryApp.handle(args);
    }
}
