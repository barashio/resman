package io.resman.resman.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Carts")
public class CustomerCart {
    @Id
    private ObjectId _id;
    private int tableNumber;
}
