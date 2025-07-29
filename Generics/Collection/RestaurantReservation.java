package com.Generics.Collection;
import java.util.*;

class Reservation {
    private String customerName;
    private int tableNumber;
    private String reservationTime;

    public Reservation(String customerName, int tableNumber, String reservationTime) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.reservationTime = reservationTime;
    }

    public int getTableNumber() { return tableNumber; }
    public String getReservationTime() { return reservationTime; }

    @Override
    public String toString() {
        return customerName + " reserved table " + tableNumber + " at " + reservationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation that = (Reservation) o;
        return tableNumber == that.tableNumber && reservationTime.equals(that.reservationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableNumber, reservationTime);
    }
}

class ReservationManager<T extends Reservation> {
    private Set<T> reservations = new LinkedHashSet<>();

    public void addReservation(T reservation) {
        if (!reservations.add(reservation)) {
            System.out.println("Duplicate reservation for table/time.");
        }
    }

    public void showReservations() {
        reservations.forEach(System.out::println);
    }
}

public class RestaurantReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReservationManager<Reservation> manager = new ReservationManager<>();

        while (true) {
            System.out.println("\n1. Add Reservation\n2. View All\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Customer Name: ");
                String name = sc.nextLine();
                System.out.print("Table Number: ");
                int table = sc.nextInt();
                sc.nextLine();
                System.out.print("Time (e.g. 7:00 PM): ");
                String time = sc.nextLine();
                manager.addReservation(new Reservation(name, table, time));
            } else if (choice == 2) {
                manager.showReservations();
            } else {
                break;
            }
        }
        sc.close();
    }
}

