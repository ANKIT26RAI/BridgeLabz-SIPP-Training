package com.DSA.Scenario;
import java.util.*;

class Customer {
    String name;
    List<String> items;

    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}

public class SmartCheckOut {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        Map<String, Integer> priceMap = Map.of("apple", 30, "bread", 25);
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("bread", 5);

        Customer c1 = new Customer("Ankit", Arrays.asList("apple", "bread"));
        queue.add(c1);

        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            int total = 0;

            for (String item : c.items) {
                if (stockMap.getOrDefault(item, 0) > 0) {
                    total += priceMap.getOrDefault(item, 0);
                    stockMap.put(item, stockMap.get(item) - 1);
                }
            }

            System.out.println(c.name + "'s total: ₹" + total);
        }
    }
}