package com.Generics.Collection;
import java.util.*;

class Order {
    private String itemName;
    private int quantity;
    private String category;

    public Order(String itemName, int quantity, String category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
    }

    public String getCategory() { return category; }

    @Override
    public String toString() {
        return quantity + " x " + itemName + " (" + category + ")";
    }
}

class Bakery<T extends Order> {
    private Queue<T> orders = new LinkedList<>();

    public void addOrder(T order) {
        orders.offer(order);
    }

    public T deliverOrder() {
        return orders.poll();
    }

    public List<T> filterOrders(String category) {
        List<T> result = new ArrayList<>();
        for (T order : orders) {
            if (order.getCategory().equalsIgnoreCase(category)) {
                result.add(order);
            }
        }
        return result;
    }
}

public class BakeryOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bakery<Order> bakery = new Bakery<>();

        while (true) {
            System.out.println("\n1. Add Order\n2. Deliver Order\n3. Filter by Category\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Item Name: ");
                String item = sc.nextLine();
                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();
                System.out.print("Category (Cake/Cookie/Pastry): ");
                String cat = sc.nextLine();
                bakery.addOrder(new Order(item, qty, cat));
            } else if (choice == 2) {
                Order delivered = bakery.deliverOrder();
                System.out.println("Delivered: " + (delivered != null ? delivered : "No Orders"));
            } else if (choice == 3) {
                System.out.print("Enter Category: ");
                String cat = sc.nextLine();
                List<Order> orders = bakery.filterOrders(cat);
                orders.forEach(System.out::println);
            } else {
                break;
            }
        }
        sc.close();
    }
}
