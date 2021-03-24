package io.resman.resman.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Categories")
public class Category {

    @Id
    private ObjectId _id;
    private String name;
    private List<Product> products;

    protected Category() {
        this.products = new ArrayList<>();
    }

    public Category(ObjectId _id, String name, List<Product> products) {
        this._id = _id;
        this.name = name;
        this.products = products;
    }

    public String get_id() { return _id.toHexString(); }
    public String getName() { return name; }
    public List<Product> getProducts() { return products; }

    public void set_id(ObjectId _id) { this._id = _id; }
    public void setName(String name) { this.name = name; }
    public void setProducts(List<Product> products) { this.products = products; }




}
