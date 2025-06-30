package com.studyopedia.ObjectOrientedDesignPrinciples;
import java.util.*;

class Product {
 private String name;
 private double quantity;
 private double pricePerUnit;

 public Product(String name, double quantity, double pricePerUnit) {
     this.name = name;
     this.quantity = quantity;
     this.pricePerUnit = pricePerUnit;
 }

 public double getTotalPrice() {
     return quantity * pricePerUnit;
 }

 public String getName() {
     return name;
 }

 public double getQuantity() {
     return quantity;
 }

 public double getPricePerUnit() {
     return pricePerUnit;
 }
}

class BillGenerator {
 public double generateBill(Customer customer) {
     double total = 0;
     for (Product product : customer.getProducts()) {
         total += product.getTotalPrice();
     }
     return total;
 }
}

class Customer {
 private String name;
 private List<Product> products;

 public Customer(String name, List<Product> products) {
     this.name = name;
     this.products = products;
 }

 public List<Product> getProducts() {
     return products;
 }

 public void requestBill() {
     BillGenerator billGenerator = new BillGenerator();
     double total = billGenerator.generateBill(this);

     System.out.println("\n--- BILL RECEIPT ---");
     System.out.println("Customer: " + name);
     System.out.println("Purchased Items:");
     for (Product product : products) {
         System.out.printf("- %s: %.2f units at $%.2f each = $%.2f\n",
             product.getName(),
             product.getQuantity(),
             product.getPricePerUnit(),
             product.getTotalPrice());
     }
     System.out.printf("Total Bill: $%.2f\n", total);
 }
}

public class GroceryStoreApp {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter customer name: ");
     String customerName = sc.nextLine();

     System.out.print("Enter number of products: ");
     int n = sc.nextInt();
     sc.nextLine(); 

     List<Product> productList = new ArrayList<>();

     for (int i = 1; i <= n; i++) {
         System.out.println("\nEnter details for product " + i);
         System.out.print("Product name: ");
         String productName = sc.nextLine();

         System.out.print("Quantity (e.g., kg or liters): ");
         double quantity = sc.nextDouble();

         System.out.print("Price per unit: ");
         double price = sc.nextDouble();
         sc.nextLine(); 

         productList.add(new Product(productName, quantity, price));
     }

     Customer customer = new Customer(customerName, productList);
     customer.requestBill();

     sc.close();
 }
}
