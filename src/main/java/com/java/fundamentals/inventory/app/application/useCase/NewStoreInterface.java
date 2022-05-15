package com.java.fundamentals.inventory.app.application.useCase;

import com.java.fundamentals.inventory.app.domain.entities.Store;

public interface NewStoreInterface {

    public Store create(short id, String name, String address);
}
