package com.java.fundamentals.inventory.app.infraestructure.repository.impl;

import com.java.fundamentals.inventory.app.domain.entities.Product;
import com.java.fundamentals.inventory.app.infraestructure.repository.ProductRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capri
 */
public class ProductRepositoryImpl implements ProductRepositoryInterface {

    private List<Product> productList = new ArrayList();

    @Override
   public Product create(Product productToCreate) {
       productList.add(productToCreate);
       return productToCreate;
   }

   public Product findById(short idProduct) {
       return null;
   }

   public Product update(Product productToUpdate) {
       return null;
   }

   public void delete(short idProduct) {
   }

   public Product getProduct(short id) {
        return productList.stream().filter(prod ->  prod.getId() == id ).findFirst().get();
   }

   @Override
   public List<Product> findAll() {
        return productList;
   }
}
