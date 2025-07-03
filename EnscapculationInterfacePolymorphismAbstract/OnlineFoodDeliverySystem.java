package com.studyopedia.EnscapculationInterfacePolymorphismAbstract;


import java.util.*;

abstract class FoodItem {
 private String itemName;
 private double price;
 private int quantity;

 public FoodItem(String itemName, double price, int quantity) {
     this.itemName = itemName;
     this.price = price;
     this.quantity = quantity;
 }

 public String getItemName() { return itemName; }
 public double getPrice() { return price; }
 public int getQuantity() { return quantity; }

 public abstract double calculateTotalPrice();

 public void getItemDetails() {
     System.out.println(itemName + " x " + quantity + " @ ₹" + price + " each");
 }
}

interface Discountable {
 void applyDiscount(double percent);
 String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
 private double discount = 0;

 public VegItem(String name, double price, int quantity) {
     super(name, price, quantity);
 }

 public double calculateTotalPrice() {
     return (getPrice() * getQuantity()) * (1 - discount / 100);
 }

 public void applyDiscount(double percent) {
     this.discount = percent;
 }

 public String getDiscountDetails() {
     return "Discount applied: " + discount + "%";
 }
}

class NonVegItem extends FoodItem implements Discountable {
 private double discount = 0;
 private final double extraCharge = 20.0;

 public NonVegItem(String name, double price, int quantity) {
     super(name, price, quantity);
 }

 public double calculateTotalPrice() {
     double base = getPrice() * getQuantity() + extraCharge;
     return base * (1 - discount / 100);
 }

 public void applyDiscount(double percent) {
     this.discount = percent;
 }

 public String getDiscountDetails() {
     return "Discount applied: " + discount + "% + ₹" + extraCharge + " non-veg charge";
 }
}

public class OnlineFoodDeliverySystem {
 public static void main(String[] args) {
     List<FoodItem> items = new ArrayList<>();

     VegItem veg = new VegItem("Paneer Tikka", 250, 2);
     veg.applyDiscount(10);

     NonVegItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);
     nonVeg.applyDiscount(5);

     items.add(veg);
     items.add(nonVeg);

     for (FoodItem item : items) {
         item.getItemDetails();
         System.out.println("Total Price: ₹" + item.calculateTotalPrice());

         if (item instanceof Discountable) {
             System.out.println(((Discountable) item).getDiscountDetails());
         }

         System.out.println("---------------------------");
     }
 }
}
