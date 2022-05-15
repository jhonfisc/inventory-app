package com.java.fundamentals.inventory.app.application;

import com.java.fundamentals.inventory.app.application.useCase.*;

import static com.java.fundamentals.inventory.app.domain.enums.MenuOptions.*;

/**
 *
 * @author jtriana
 */
public class InventoryApp {

    private CheckStoresInterface checkStoresInterface;
    private NewStoreInterface newStoreInterface;
    private RegisterNewProductInterface registerNewProductInterface;
    private UpdateStoreInterface updateStoreInterface;
    private FindStoreByIdInterface findStoreByIdInterface;
    private FindAllStoresInterface findAllStoresInterface;

    public InventoryApp(CheckStoresInterface checkStoresInterface,
                        NewStoreInterface newStoreInterface,
                        RegisterNewProductInterface registerNewProductInterface,
                        UpdateStoreInterface updateStoreInterface,
                        FindStoreByIdInterface findStoreByIdInterface,
                        FindAllStoresInterface findAllStoresInterface) {
        this.checkStoresInterface = checkStoresInterface;
        this.newStoreInterface = newStoreInterface;
        this.registerNewProductInterface = registerNewProductInterface;
        this.updateStoreInterface = updateStoreInterface;
        this.findStoreByIdInterface = findStoreByIdInterface;
        this.findAllStoresInterface = findAllStoresInterface;
    }

    public void handle(String[] args) {
        checkStoresInterface.check();
        this.checkOptions(args);
    }

    private void checkOptions(String[] args) {
        if (args[0].equals(OPTION_1.getOption())) {
            this.findAllStores();
            return;
        } else if (args[0].equals(OPTION_2.getOption())) {
            this.findStoreById();
            return;
        } else if (args[0].equals(OPTION_3.getOption())) {
            this.updateStore();
            return;
        } else {
            System.out.println("No se reconoció ninguna operación!!");
        }
    }

    private void findAllStores() {
        findAllStoresInterface.search();
    }

    private void findStoreById() {
        findStoreByIdInterface.search((short) 2);
    }

    private void updateStore() {
        updateStoreInterface.update(newStoreInterface.create((short)4, "Tienda1 modificada", "Calle 1"));
    }

    private void registerNewProduct() {
        registerNewProductInterface.create(newStoreInterface.create((short) 0, "", ""));
    }
}
