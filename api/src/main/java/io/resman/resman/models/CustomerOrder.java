package io.resman.resman.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Orders")
public class CustomerOrder {
    @Id
    private ObjectId _id;
    private int tableNumber;
    private String menuItemId;
    private boolean isCompleted;

    public CustomerOrder(ObjectId _id, int tableNumber, String menuItemId, boolean isCompleted) {
        this.tableNumber = tableNumber;
        this.menuItemId = menuItemId;
        this.isCompleted = isCompleted;
    }

    public String get_id() { return _id.toHexString(); }
    public int getTableNumber() { return tableNumber; }
    public String getMenuItemId() { return menuItemId; }
    public boolean isCompleted() { return isCompleted; }

    public void set_id(ObjectId _id) { this._id = _id; }
    public void setTableNumber(int tableNumber) { this.tableNumber = tableNumber; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
    public void setMenuItemId(String menuItemId) { this.menuItemId = menuItemId; }

}
