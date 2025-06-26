package com.studyopedia.StaticfinalInstance;
public class VehicleRegistration {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public VehicleRegistration(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof VehicleRegistration) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        VehicleRegistration vehicle1 = new VehicleRegistration("John Doe", "Car", "V001");
        vehicle1.displayDetails();
        VehicleRegistration vehicle2 = new VehicleRegistration("Jane Smith", "Bike", "V002");
        vehicle2.displayDetails();
    }
}