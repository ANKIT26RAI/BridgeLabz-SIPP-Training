package com.studyopedia.EnscapculationInterfacePolymorphismAbstract;

import java.util.*;

abstract class Patient {
 private String patientId;
 private String name;
 private int age;

 public Patient(String id, String name, int age) {
     this.patientId = id;
     this.name = name;
     this.age = age;
 }

 public String getPatientId() { return patientId; }
 public String getName() { return name; }

 public abstract double calculateBill();

 public void getPatientDetails() {
     System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
 }
}

interface MedicalRecord {
 void addRecord(String record);
 void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
 private int daysAdmitted;
 private double dailyCharge;
 private List<String> records = new ArrayList<>();

 public InPatient(String id, String name, int age, int days, double charge) {
     super(id, name, age);
     this.daysAdmitted = days;
     this.dailyCharge = charge;
 }

 public double calculateBill() {
     return daysAdmitted * dailyCharge;
 }

 public void addRecord(String record) {
     records.add(record);
 }

 public void viewRecords() {
     System.out.println("In-Patient Records: " + records);
 }
}

class OutPatient extends Patient implements MedicalRecord {
 private double consultationFee;
 private List<String> records = new ArrayList<>();

 public OutPatient(String id, String name, int age, double fee) {
     super(id, name, age);
     this.consultationFee = fee;
 }

 public double calculateBill() {
     return consultationFee;
 }

 public void addRecord(String record) {
     records.add(record);
 }

 public void viewRecords() {
     System.out.println("Out-Patient Records: " + records);
 }
}

public class HospitalPatientManagement {
 public static void main(String[] args) {
     List<Patient> patients = new ArrayList<>();

     InPatient p1 = new InPatient("P001", "Amit", 45, 4, 2000);
     p1.addRecord("Blood Test");
     p1.addRecord("X-Ray");

     OutPatient p2 = new OutPatient("P002", "Neha", 32, 500);
     p2.addRecord("Consulted Dermatologist");

     patients.add(p1);
     patients.add(p2);

     for (Patient p : patients) {
         p.getPatientDetails();
         System.out.println("Total Bill: ₹" + p.calculateBill());

         if (p instanceof MedicalRecord) {
             ((MedicalRecord) p).viewRecords();
         }

         System.out.println("---------------------------");
     }
 }
}
