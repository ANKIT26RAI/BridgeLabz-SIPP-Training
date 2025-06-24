package com.studyopedia.JavaClassandObject.Level1;

public class EmployeesDetails {
    String name;
    int id;
    double salary;

    public EmployeesDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        EmployeesDetails emp = new EmployeesDetails("Ankit", 101, 50000);
        emp.displayDetails();
    }
}