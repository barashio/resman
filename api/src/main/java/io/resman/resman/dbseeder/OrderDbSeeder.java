package io.resman.resman.dbseeder;

import io.resman.resman.models.CustomerOrder;
import io.resman.resman.models.Product;
import io.resman.resman.repositories.CustomerOrderRepository;
import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class OrderDbSeeder implements CommandLineRunner {
    private CustomerOrderRepository CustomerOrderRepository;

    public void CustomerOrderRepository(CustomerOrderRepository CustomerOrderRepository) {
        this.CustomerOrderRepository = CustomerOrderRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        CustomerOrder fromBarash = new CustomerOrder(
//                ObjectId.get(),
//                1,
//                false,
//                Arrays.asList(
//                        new Product(
//                                ObjectId.get(),
//
//                        )
//                )
//        )
    }
}
