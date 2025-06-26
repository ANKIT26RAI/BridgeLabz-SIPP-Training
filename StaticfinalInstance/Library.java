package com.studyopedia.StaticfinalInstance;
public class Library {
    private static String libraryName = "City Library";
    private static int totalBooks = 0;
    private final String isbn;
    private String title;
    private String author;

    public Library(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Library) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Library book1 = new Library("1984", "George Orwell", "123456789");
        book1.displayDetails();
        Library book2 = new Library("To Kill a Mockingbird", "Harper Lee", "987654321");
        book2.displayDetails();
        displayLibraryName();
    }
}