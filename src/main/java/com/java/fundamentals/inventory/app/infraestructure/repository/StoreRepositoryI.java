package com.java.fundamentals.inventory.app.infraestructure.repository;

import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.infraestructure.exceptions.StoreNotFoundException;
import java.util.List;

/**
 *
 * @author capri
 */
public interface StoreRepositoryI {

    Store create(Store storeToCreate);
    /**
     * Permite consultar una tienda por su id.
     *
     * @param idStore Corresponde al identificador con el cual se hará la búsqueda de la tienda.
     * @return Retorna una referencia a la tienda encontrada por el id suministrado. En caso de que no
     *         sea posible encontrar la tienda, se retornará null
     */
    public Store findById(short idStore) throws StoreNotFoundException;
    public List<Store> findAll();
    public Store update(Store storeToUpdate) throws StoreNotFoundException;
    public void delete(short idStore);

}
