package io.resman.resman.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Venue {
    @Id
    private ObjectId _id;
    private String businessName;
    private int streetNumber;
    private String streetName;
    private String city;
    private String postCode;

    public Venue() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Venue(ObjectId _id, String businessName, int streetNumber, String streetName, String city, String postCode,
                 boolean isOpen, int prepTimeMinutes) {
        super();
        this._id = _id;
        this.businessName = businessName;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.postCode = postCode;
    }

    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getBusinessName() { return businessName; }
    public void setBusinessName(String businessName) {  this.businessName = businessName; }

    public int getStreetNumber() { return streetNumber; }
    public void setStreetNumber(int streetNumber) {  this.streetNumber = streetNumber; }

    public String getStreetName() { return streetName; }
    public void setStreetName(String streetName) {  this.streetName = streetName; }

    public String getCity() { return city; }
    public void setCity(String city) {  this.city = city; }

    public String getPostCode() { return postCode; }
    public void setPostCode(String postCode) {  this.postCode = postCode; }
}
