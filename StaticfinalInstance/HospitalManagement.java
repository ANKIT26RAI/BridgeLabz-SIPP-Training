package com.studyopedia.StaticfinalInstance;

public class HospitalManagement {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public HospitalManagement(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof HospitalManagement) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        HospitalManagement patient1 = new HospitalManagement("Alice", 30, "Flu", "P001");
        patient1.displayDetails();
        HospitalManagement patient2 = new HospitalManagement("Bob", 40, "Cold", "P002");
        patient2.displayDetails();
        System.out.println("Total Patients: " + getTotalPatients());
    }
}