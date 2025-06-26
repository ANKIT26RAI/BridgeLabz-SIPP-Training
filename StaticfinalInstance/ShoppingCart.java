package com.studyopedia.StaticfinalInstance;
public class ShoppingCart {
    private static double discount = 0.1;
    private final String productID;
    private String productName;
    private double price;

    public ShoppingCart(String productName, double price, String productID) {
        this.productName = productName;
        this.price = price;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof ShoppingCart) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Product ID: " + productID);
        }
    }

    public static void main(String[] args) {
        ShoppingCart product1 = new ShoppingCart("Laptop", 1000, "P001");
        product1.displayDetails();
        ShoppingCart product2 = new ShoppingCart("Smartphone", 500, "P002");
        product2.displayDetails();
    }
}