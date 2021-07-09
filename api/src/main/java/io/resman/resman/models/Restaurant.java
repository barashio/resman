package io.resman.resman.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Restaurant")
public class Restaurant {
    @Id
    private ObjectId _id;
    private String name;
    private Address address;
    private String email;
    private String phone;

    private List<Menu> menu;
    private List<Review> reviews;

    protected Restaurant() {
        this.menu = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public Restaurant(ObjectId _id,
                      String name, Address address, String email, String phone,
                      List<Menu> menu, List<Review> reviews) {
        this._id = _id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.menu = menu;
        this.reviews = reviews;
    }

    public String get_id() { return _id.toHexString(); }
    public String getName() { return name; }
    public Address getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public List<Menu> getMenu() { return menu; }
    public List<Review> getReview() { return reviews; }

    public void set_id(ObjectId _id) { this._id = _id; }
    public void setName(String name) { this.name = name; }
    public void setAddress(Address address) { this.address = address; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setMenu(List<Menu> menu) { this.menu = menu; }
    public void setReviews(List<Review> reviews) { this.reviews = reviews; }


}
