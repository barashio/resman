package io.resman.resman.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    @Id
    private ObjectId _id;
    private List<Category> categories;

    protected Menu() {
        this.categories = new ArrayList<>();
    }

    public Menu(ObjectId _id, List<Category> categories) {
        this._id = _id;
        this.categories = categories;
    }

    public String get_id() { return _id.toHexString(); }
    public List<Category> getCategories() { return categories; }

    public void set_id(ObjectId _id) { this._id = _id; }
    public void setCategories(List<Category> categories) { this.categories = categories; }



}
