package com.java.fundamentals.inventory.app;

import com.java.fundamentals.inventory.app.application.InventoryApp;
import com.java.fundamentals.inventory.app.application.services.ProductServiceInterface;
import com.java.fundamentals.inventory.app.application.services.impl.ProductServiceImpl;
import com.java.fundamentals.inventory.app.application.useCase.*;
import com.java.fundamentals.inventory.app.application.useCase.impl.*;
import com.java.fundamentals.inventory.app.infraestructure.repository.ProductRepositoryInterface;
import com.java.fundamentals.inventory.app.infraestructure.repository.StoreRepositoryI;
import com.java.fundamentals.inventory.app.infraestructure.repository.impl.ProductRepositoryImpl;
import com.java.fundamentals.inventory.app.infraestructure.repository.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventory.app.application.services.StoreServiceI;
import com.java.fundamentals.inventory.app.application.services.impl.StoreServiceImpl;

public class Main {
    public static void main(String[] args) {
        StoreRepositoryI storeRepositoryI = new StoreRepositoryImpl();
        StoreServiceI storeServiceI = new StoreServiceImpl(storeRepositoryI);
        ProductRepositoryInterface productRepositoryInterface = new ProductRepositoryImpl();
        ProductServiceInterface productServiceInterface = new ProductServiceImpl(productRepositoryInterface);
        CheckStoresInterface checkStoresInterface = new CheckStoresImpl(storeServiceI);
        NewStoreInterface newStoreInterface = new NewStoreImpl(storeServiceI);
        RegisterNewProductInterface registerNewProductInterface = new RegisterNewProductImpl(productServiceInterface);
        UpdateStoreInterface updateStoreInterface = new UpdateStoreImpl(storeServiceI);
        FindStoreByIdInterface findStoreByIdInterface = new FindStoreByIdImpl(storeServiceI);
        FindAllStoresInterface findAllStoresInterface = new FindAllStoresImpl(storeServiceI);
        ShowProductListInterface showProductListInterface = new ShowProductListImpl(productServiceInterface);
        GetProductsGreaterThanInterface getProductsGreaterThanInterface = new GetProductsGreaterThanImpl(productServiceInterface);
        GetProductsLessThanInterface getProductsLessThanInterface = new GetProductsLessThanImpl(productServiceInterface);
        InventoryApp inventoryApp =
                new InventoryApp(checkStoresInterface,
                                newStoreInterface,
                                registerNewProductInterface,
                                updateStoreInterface,
                                findStoreByIdInterface,
                                findAllStoresInterface,
                                showProductListInterface,
                                getProductsGreaterThanInterface,
                                getProductsLessThanInterface
                );
        inventoryApp.handle(args);
    }
}
