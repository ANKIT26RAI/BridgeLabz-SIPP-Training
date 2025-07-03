package com.studyopedia.EnscapculationInterfacePolymorphismAbstract;


import java.util.*;

abstract class Product {
 private String productId;
 private String name;
 private double price;

 public Product(String productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }

 public String getProductId() { return productId; }
 public String getName() { return name; }
 public double getPrice() { return price; }

 public abstract double calculateDiscount();
}

interface Taxable {
 double calculateTax();
 String getTaxDetails();
}

class Electronics extends Product implements Taxable {
 public Electronics(String productId, String name, double price) {
     super(productId, name, price);
 }

 @Override
 public double calculateDiscount() {
     return getPrice() * 0.1; // 10% discount
 }

 @Override
 public double calculateTax() {
     return getPrice() * 0.18; // 18% GST
 }

 @Override
 public String getTaxDetails() {
     return "Electronics Tax: 18% GST";
 }
}

class Clothing extends Product implements Taxable {
 public Clothing(String productId, String name, double price) {
     super(productId, name, price);
 }

 @Override
 public double calculateDiscount() {
     return getPrice() * 0.2; // 20% discount
 }

 @Override
 public double calculateTax() {
     return getPrice() * 0.12; // 12% GST
 }

 @Override
 public String getTaxDetails() {
     return "Clothing Tax: 12% GST";
 }
}

class Groceries extends Product {
 public Groceries(String productId, String name, double price) {
     super(productId, name, price);
 }

 @Override
 public double calculateDiscount() {
     return 0; // No discount
 }
}

public class EcommercePlatform {
 public static void main(String[] args) {
     List<Product> products = new ArrayList<>();
     products.add(new Electronics("P001", "Smartphone", 30000));
     products.add(new Clothing("P002", "T-Shirt", 1000));
     products.add(new Groceries("P003", "Rice Bag", 1500));

     for (Product p : products) {
         System.out.println("Product: " + p.getName());
         double discount = p.calculateDiscount();
         double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
         double finalPrice = p.getPrice() + tax - discount;

         System.out.println("Price: " + p.getPrice());
         System.out.println("Discount: " + discount);
         System.out.println("Tax: " + tax);
         System.out.println("Final Price: " + finalPrice);
         System.out.println("---------------------------");
     }
 }
}
