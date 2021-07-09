package io.resman.resman.repositories;

import io.resman.resman.models.CustomerOrder;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerOrderRepository extends MongoRepository<CustomerOrder, String> {
    CustomerOrder findBy_id(ObjectId _id);
}
