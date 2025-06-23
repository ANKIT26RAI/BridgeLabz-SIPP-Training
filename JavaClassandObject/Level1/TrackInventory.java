package com.studyopedia.JavaClassandObject.Level1;


public class TrackInventory {
    int itemCode;
    String itemName;
    double price;

    public TrackInventory(int code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    public double calculateTotal(int quantity) {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
    }

    public static void main(String[] args) {
        TrackInventory item = new TrackInventory(101, "Pen", 10.0);
        item.displayItem();
        System.out.println("Total Cost (5 units): " + item.calculateTotal(5));
    }
}

