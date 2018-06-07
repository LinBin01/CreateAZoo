package com.company.inventory;

public class Souvenir extends Items{
    private String type;
    private int itemID;

    public Souvenir(double price, String itemName, int quantity, String dateReceived, String type, int itemID) {
        super(price, itemName, quantity, dateReceived);
        this.type = type;
        this.itemID = itemID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
}
