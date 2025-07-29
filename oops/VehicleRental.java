package com.workshop.oops;
import java.util.Scanner;
  interface Rentable {
	double calculateRent(int days);
	
}
abstract class  Vehicle implements Rentable{
	protected String licensePlate;
	protected double baseRate;
	
public  Vehicle(String licensePlate,double baseRate) {
	this.licensePlate=licensePlate;
	this.baseRate=baseRate;
}
public String getLicensePlate() {
	return licensePlate;
}
public double getBaseRate() {
	return baseRate;
}
}
class Bike extends Vehicle{
	public Bike(String licensePlate) {
		super(licensePlate,100);
	}
	public double calculateRent(int days) {
		return baseRate * days;
	}
}
class Car extends Vehicle{
	private boolean luxury;
	public Car(String licensePlate,boolean luxury ) {
		super(licensePlate,luxury?500:300);
		this.luxury = luxury;
	}
	
	public double calculateRent(int days) {
		double surcharge = luxury? 200:0;
		return (baseRate*days)+surcharge;
	}
}
 class Truck extends Vehicle{
	private double loadFee;
	public Truck(String licensePlate,double loadFee) {
		super(licensePlate,800);
		this.loadFee = loadFee;
	}
	public double calculateRent(int days) {
		return (baseRate*days)+loadFee;
	}
}
class Customer{
	private String name;
	private String licenseNumber;
	
	public Customer(String name, String licenseNumber) {
		this.name=name;
		this.licenseNumber=licenseNumber;
	}
	public String getName() {
		return name;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
}
public class VehicleRental{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Customer License Number: ");
		String licenseNumber=sc.nextLine();
		Customer customer = new Customer(name,licenseNumber);
		
		System.out.print("Enter vehicle type (bike/car/truck): ");
        String type = sc.next().toLowerCase();
        System.out.print("Enter vehicle license plate: ");
        String plate = sc.next();

        Vehicle vehicle;
        switch (type) {
            case "bike":
                vehicle = new Bike(plate);
                break;
            case "car":
                System.out.print("Is it a luxury car? (true/false): ");
                boolean isLuxury = sc.nextBoolean();
                vehicle = new Car(plate, isLuxury);
                break;
            case "truck":
                System.out.print("Enter load fee: ");
                double loadFee = sc.nextDouble();
                vehicle = new Truck(plate, loadFee);
                break;
            default:
                System.out.println("Invalid vehicle type. Exiting.");
                sc.close();
                return;
        }

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        System.out.println("\nCustomer Name: " + customer.getName());
        System.out.println("License Number: " + customer.getLicenseNumber());
        System.out.println("Vehicle License Plate: " + vehicle.getLicensePlate());
        System.out.println("Rental Cost for " + days + " days: ₹" + vehicle.calculateRent(days));

        sc.close();
}
}
