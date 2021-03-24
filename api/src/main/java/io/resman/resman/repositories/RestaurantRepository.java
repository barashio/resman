package io.resman.resman.repositories;

import io.resman.resman.models.Restaurant;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String>{
    Restaurant findBy_id(ObjectId _id);
}
