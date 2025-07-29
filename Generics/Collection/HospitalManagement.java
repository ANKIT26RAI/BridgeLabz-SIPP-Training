package com.Generics.Collection;
import java.util.*;

class Appointment {
    private String patientName;
    private String doctorName;
    private String timeSlot;

    public Appointment(String patientName, String doctorName, String timeSlot) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return patientName + " with Dr. " + doctorName + " at " + timeSlot;
    }
}

class AppointmentManager<T extends Appointment> {
    private Queue<T> queue = new LinkedList<>();

    public void book(T appt) {
        queue.offer(appt);
    }

    public T serve() {
        return queue.poll();
    }

    public T next() {
        return queue.peek();
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AppointmentManager<Appointment> manager = new AppointmentManager<>();

        while (true) {
            System.out.println("\n1. Book Appointment\n2. View Next\n3. Serve Next\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Patient Name: ");
                String p = sc.nextLine();
                System.out.print("Doctor Name: ");
                String d = sc.nextLine();
                System.out.print("Time Slot: ");
                String t = sc.nextLine();
                manager.book(new Appointment(p, d, t));
            } else if (choice == 2) {
                Appointment next = manager.next();
                System.out.println("Next: " + (next != null ? next : "No Appointments"));
            } else if (choice == 3) {
                Appointment served = manager.serve();
                System.out.println("Served: " + (served != null ? served : "No Appointments"));
            } else {
                break;
            }
        }
        sc.close();
    }
}
