package com.java.fundamentals.inventory.app.application.useCase;

import com.java.fundamentals.inventory.app.domain.entities.Store;

public interface RegisterNewProductInterface {

    public void create(Store store);
}
