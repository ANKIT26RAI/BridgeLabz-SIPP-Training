package com.studyopedia.JavaClassandObject.Level2;


public class ShoppingCart {
    String itemName;
    double price;
    int quantity;

    public ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayCartItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }

    public static void main(String[] args) {
        ShoppingCart item1 = new ShoppingCart("Notebook", 50.0, 3);
        item1.displayCartItem();
    }
}
