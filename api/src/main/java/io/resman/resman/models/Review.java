package io.resman.resman.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Review {
    @Id
    private ObjectId _id;
    private String userName;
    private String description;
    private int rating;
    private boolean approved;

    protected Review() {}

    public Review(ObjectId _id, String userName, String description, int rating, boolean approved) {
        this._id = _id;
        this.userName = userName;
        this.description = description;
        this.rating = rating;
        this.approved = approved;
    }

    public String get_id() { return _id.toHexString(); }
    public String getUserName() { return userName; }
    public String getDescription() { return description; }
    public int getRating() { return rating; }
    public boolean isApproved() { return approved; }

    public void set_id(ObjectId _id) { this._id = _id; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setDescription(String description) { this.description = description; }
    public void setRating(int rating) { this.rating = rating; }
    public void setApproved(boolean approved) { this.approved = approved; }

}
