package com.studyopedia.EnscapculationInterfacePolymorphismAbstract;

import java.util.*;

abstract class Vehicle {
 private String vehicleNumber;
 private String type;
 private double rentalRate;

 public Vehicle(String vehicleNumber, String type, double rentalRate) {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.rentalRate = rentalRate;
 }

 public String getVehicleNumber() { return vehicleNumber; }
 public String getType() { return type; }
 public double getRentalRate() { return rentalRate; }

 public abstract double calculateRentalCost(int days);
}

interface Insurable {
 double calculateInsurance();
 String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
 public Car(String number, double rate) {
     super(number, "Car", rate);
 }

 public double calculateRentalCost(int days) {
     return days * getRentalRate();
 }

 public double calculateInsurance() {
     return 2000;
 }

 public String getInsuranceDetails() {
     return "Car Insurance: ₹2000 flat";
 }
}

class Bike extends Vehicle implements Insurable {
 public Bike(String number, double rate) {
     super(number, "Bike", rate);
 }

 public double calculateRentalCost(int days) {
     return days * getRentalRate();
 }

 public double calculateInsurance() {
     return 500;
 }

 public String getInsuranceDetails() {
     return "Bike Insurance: ₹500 flat";
 }
}

class Truck extends Vehicle implements Insurable {
 public Truck(String number, double rate) {
     super(number, "Truck", rate);
 }

 public double calculateRentalCost(int days) {
     return days * getRentalRate() + 1000;
 }

 public double calculateInsurance() {
     return 5000;
 }

 public String getInsuranceDetails() {
     return "Truck Insurance: ₹5000 flat";
 }
}

public class VehicleRentalSystem {
 public static void main(String[] args) {
     List<Vehicle> vehicles = new ArrayList<>();
     vehicles.add(new Car("CAR101", 1500));
     vehicles.add(new Bike("BIKE202", 300));
     vehicles.add(new Truck("TRUCK303", 5000));

     int rentalDays = 5;
     for (Vehicle v : vehicles) {
         System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
         System.out.println("Rental Cost for " + rentalDays + " days: ₹" + v.calculateRentalCost(rentalDays));

         if (v instanceof Insurable) {
             System.out.println(((Insurable) v).getInsuranceDetails());
             System.out.println("Insurance Cost: ₹" + ((Insurable) v).calculateInsurance());
         }
         System.out.println("---------------------------");
     }
 }
}
