package com.java.fundamentals.inventory.app.application;

import com.java.fundamentals.inventory.app.application.useCase.*;

import java.util.logging.Logger;

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
    private ShowProductListInterface showProductListInterface;
    private GetProductsGreaterThanInterface getProductsGreaterThanInterface;
    private GetProductsLessThanInterface getProductsLessThanInterface;

    public InventoryApp(CheckStoresInterface checkStoresInterface,
                        NewStoreInterface newStoreInterface,
                        RegisterNewProductInterface registerNewProductInterface,
                        UpdateStoreInterface updateStoreInterface,
                        FindStoreByIdInterface findStoreByIdInterface,
                        FindAllStoresInterface findAllStoresInterface,
                        ShowProductListInterface showProductListInterface,
                        GetProductsGreaterThanInterface getProductsGreaterThanInterface,
                        GetProductsLessThanInterface getProductsLessThanInterface) {
        this.checkStoresInterface = checkStoresInterface;
        this.newStoreInterface = newStoreInterface;
        this.registerNewProductInterface = registerNewProductInterface;
        this.updateStoreInterface = updateStoreInterface;
        this.findStoreByIdInterface = findStoreByIdInterface;
        this.findAllStoresInterface = findAllStoresInterface;
        this.showProductListInterface = showProductListInterface;
        this.getProductsGreaterThanInterface = getProductsGreaterThanInterface;
        this.getProductsLessThanInterface = getProductsLessThanInterface;
    }

    public void handle(String[] args) {
        checkStoresInterface.check();
        this.checkOptions(args);
    }

    private void checkOptions(String[] args) {
        try {
            if (args[0].equals(OPTION_1.getOption())) {
                this.findAllStores();
                return;
            } else if (args[0].equals(OPTION_2.getOption())) {
                this.findStoreById();
                return;
            } else if (args[0].equals(OPTION_3.getOption())) {
                this.updateStore();
                return;
            } else if (args[0].equals(OPTION_4.getOption())) {
                this.registerNewProduct();
                this.showProductList();
                return;
            } else if (args[0].equals(OPTION_5.getOption())) {
                this.registerNewProduct();
                this.getProductsGreaterThan(Integer.valueOf(args[1]));
                return;
            } else if (args[0].equals(OPTION_6.getOption())) {
                this.registerNewProduct();
                this.getProductsLessThan(Integer.valueOf(args[1]));
                return;
            } else if (args[0].equals(OPTION_7.getOption())) {
                this.registerNewProduct();
                this.getProductsLessThan(Integer.valueOf(args[1]));
                return;
            } else {
                System.out.println("No se reconoció ninguna operación!!");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Debe ingresar una operacion.");
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

    private void showProductList() {
        showProductListInterface.show();
    }

    private void getProductsGreaterThan(Integer limit) {
        this.getProductsGreaterThanInterface.get(limit);
    }

    private void getProductsLessThan(Integer limit) {
        this.getProductsLessThanInterface.get(limit);
    }
}
