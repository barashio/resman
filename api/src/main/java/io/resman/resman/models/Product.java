package io.resman.resman.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
public class Product {
    @Id
    private ObjectId _id;
    private String name;
    private String description;
    private double price;

    protected Product() {}

    public Product(ObjectId _id, String name, String description, double price) {
        this._id = _id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String get_id() { return _id.toHexString(); }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }

    public void set_id(ObjectId _id) { this._id = _id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(double price) { this.price = price; }
}
