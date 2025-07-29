package com.Generics.Collection;
import java.util.*;

class Item {
    private String itemName;
    private int quantity;
    private double price;

    public Item(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() { return itemName; }
    public double getTotalPrice() { return quantity * price; }

    @Override
    public String toString() {
        return itemName + " - " + quantity + " x " + price + " = " + getTotalPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item i = (Item) o;
        return itemName.equalsIgnoreCase(i.itemName);
    }

    @Override
    public int hashCode() {
        return itemName.toLowerCase().hashCode();
    }
}

class ShoppingCart<T extends Item> {
    private Set<T> items = new HashSet<>();

    public void addItem(T item) {
        if (!items.add(item)) {
            System.out.println("Duplicate item: " + item.getItemName());
        }
    }

    public void showCart() {
        items.forEach(System.out::println);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Item::getTotalPrice).sum();
    }
}

public class SuperMarketBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart<Item> cart = new ShoppingCart<>();

        while (true) {
            System.out.println("\n1. Add Item\n2. View Cart\n3. Total Amount\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Item Name: ");
                String name = sc.nextLine();
                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                System.out.print("Price per Unit: ");
                double price = sc.nextDouble();
                cart.addItem(new Item(name, qty, price));
            } else if (choice == 2) {
                cart.showCart();
            } else if (choice == 3) {
                System.out.println("Total Amount: ₹" + cart.calculateTotal());
            } else {
                break;
            }
        }
        sc.close();
    }
}
