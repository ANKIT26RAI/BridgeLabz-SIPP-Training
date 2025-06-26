package com.studyopedia.StaticfinalInstance;
public class University {
    private static String universityName = "State University";
    private static int totalStudents = 0;
    private final String rollNumber;
    private String name;
    private String grade;

    public University(String name, String grade, String rollNumber) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof University) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        University student1 = new University("Alice", "A", "R001");
        student1.displayDetails();
        University student2 = new University("Bob", "B", "R002");
        student2.displayDetails();
        displayTotalStudents();
    }
}