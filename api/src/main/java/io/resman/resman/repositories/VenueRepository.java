package io.resman.resman.repositories;

import io.resman.resman.models.Venue;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends MongoRepository<Venue, Long> {
    Venue findBy_id(ObjectId _id);
}
