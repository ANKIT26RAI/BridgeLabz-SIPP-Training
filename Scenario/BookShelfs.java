package com.DSA.Scenario;
import java.util.*;

public class BookShelfs {
    public static void main(String[] args) {
        Map<String, LinkedList<String>> genreMap = new HashMap<>();
        Set<String> bookSet = new HashSet<>();

        String genre = "Fiction";
        String book = "1984";

        if (!bookSet.contains(book)) {
            genreMap.putIfAbsent(genre, new LinkedList<>());
            genreMap.get(genre).add(book);
            bookSet.add(book);
        }

        for (String g : genreMap.keySet()) {
            System.out.println(g + " Genre:");
            for (String b : genreMap.get(g)) {
                System.out.println("  - " + b);
            }
        }
    }
}