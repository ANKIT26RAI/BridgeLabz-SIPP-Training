package com.studyopedia.EnscapculationInterfacePolymorphismAbstract;

import java.util.*;

abstract class Employee {
 private String employeeId;
 private String name;
 private double baseSalary;

 public Employee(String employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public String getEmployeeId() { return employeeId; }
 public String getName() { return name; }
 public double getBaseSalary() { return baseSalary; }

 public void setBaseSalary(double baseSalary) {
     this.baseSalary = baseSalary;
 }

 public abstract double calculateSalary();

 public void displayDetails() {
     System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
 }
}

interface Department {
 void assignDepartment(String department);
 String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
 private double fixedBonus;
 private String department;

 public FullTimeEmployee(String employeeId, String name, double baseSalary, double fixedBonus) {
     super(employeeId, name, baseSalary);
     this.fixedBonus = fixedBonus;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + fixedBonus;
 }

 @Override
 public void assignDepartment(String department) {
     this.department = department;
 }

 @Override
 public String getDepartmentDetails() {
     return "Department: " + department;
 }
}

class PartTimeEmployee extends Employee implements Department {
 private int workHours;
 private double hourlyRate;
 private String department;

 public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
     super(employeeId, name, baseSalary);
     this.workHours = workHours;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + (workHours * hourlyRate);
 }

 @Override
 public void assignDepartment(String department) {
     this.department = department;
 }

 @Override
 public String getDepartmentDetails() {
     return "Department: " + department;
 }
}

public class EmployeeManagementSystem {
 public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();

     FullTimeEmployee emp1 = new FullTimeEmployee("E101", "Alice", 30000, 5000);
     emp1.assignDepartment("HR");

     PartTimeEmployee emp2 = new PartTimeEmployee("E102", "Bob", 15000, 20, 500);
     emp2.assignDepartment("Support");

     employees.add(emp1);
     employees.add(emp2);

     for (Employee emp : employees) {
         emp.displayDetails();
         System.out.println("Calculated Salary: " + emp.calculateSalary());

         if (emp instanceof Department) {
             System.out.println(((Department) emp).getDepartmentDetails());
         }

         System.out.println("---------------------------");
     }
 }
}
