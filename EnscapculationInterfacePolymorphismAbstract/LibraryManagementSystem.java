package com.studyopedia.EnscapculationInterfacePolymorphismAbstract;

import java.util.*;

abstract class LibraryItem {
 private String itemId;
 private String title;
 private String author;

 public LibraryItem(String itemId, String title, String author) {
     this.itemId = itemId;
     this.title = title;
     this.author = author;
 }

 public abstract int getLoanDuration();

 public void getItemDetails() {
     System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
 }
}

interface Reservable {
 boolean reserveItem(String userId);
 boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
 public Book(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 public int getLoanDuration() {
     return 14;
 }

 public boolean reserveItem(String userId) {
     return true;
 }

 public boolean checkAvailability() {
     return true;
 }
}

class Magazine extends LibraryItem implements Reservable {
 public Magazine(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 public int getLoanDuration() {
     return 7;
 }

 public boolean reserveItem(String userId) {
     return false;
 }

 public boolean checkAvailability() {
     return true;
 }
}

class DVD extends LibraryItem implements Reservable {
 public DVD(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 public int getLoanDuration() {
     return 3;
 }

 public boolean reserveItem(String userId) {
     return true;
 }

 public boolean checkAvailability() {
     return false;
 }
}

public class LibraryManagementSystem {
 public static void main(String[] args) {
     List<LibraryItem> items = new ArrayList<>();
     items.add(new Book("B001", "Java Basics", "James Gosling"));
     items.add(new Magazine("M002", "Time", "Editor"));
     items.add(new DVD("D003", "Inception", "Christopher Nolan"));

     for (LibraryItem item : items) {
         item.getItemDetails();
         System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

         if (item instanceof Reservable) {
             System.out.println("Available: " + ((Reservable) item).checkAvailability());
             System.out.println("Reserved: " + ((Reservable) item).reserveItem("U1001"));
         }
         System.out.println("---------------------------");
     }
 }
}

