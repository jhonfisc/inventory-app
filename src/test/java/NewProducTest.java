import com.java.fundamentals.inventory.app.application.services.ProductServiceInterface;
import com.java.fundamentals.inventory.app.application.services.impl.ProductServiceImpl;
import com.java.fundamentals.inventory.app.application.useCase.RegisterNewProductInterface;
import com.java.fundamentals.inventory.app.application.useCase.impl.RegisterNewProductImpl;
import com.java.fundamentals.inventory.app.domain.entities.Company;
import com.java.fundamentals.inventory.app.domain.entities.Store;
import com.java.fundamentals.inventory.app.infraestructure.repository.ProductRepositoryInterface;
import com.java.fundamentals.inventory.app.infraestructure.repository.impl.ProductRepositoryImpl;

public class NewProducTest {

    public void when_create_new_product_then_add_in_repository() {
        ProductRepositoryInterface productRepositoryInterface = new ProductRepositoryImpl();
        ProductServiceInterface productServiceInterface = new ProductServiceImpl(productRepositoryInterface);
        RegisterNewProductInterface registerNewProductInterface = new RegisterNewProductImpl(productServiceInterface);
        Store store = new Store((short) 1, "store1", "addr", new Company());
        registerNewProductInterface.create(store);
    }
}
