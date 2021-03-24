package io.resman.resman.models;

public class Address {
    private int number;
    private String streetName;
    private String city;
    private String postCode;

    protected Address() {}

    public Address (int number, String streetName, String city, String postCode) {
        this.number = number;
        this.streetName = streetName;
        this.city = city;
        this.postCode = postCode;
    }

    public int getNumber() { return number; }
    public String getStreetName() { return streetName; }
    public String getCity() { return city; }
    public String getPostCode() { return postCode; }

    public void setNumber(int number) { this.number = number; }
    public void setStreetName(String streetName) { this.streetName = streetName; }
    public void setCity(String city) { this.city = city; }
    public void setPostCode(String postCode) { this.postCode = postCode; }
}
