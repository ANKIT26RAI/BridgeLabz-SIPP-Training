package com.Generics.Collection;
import java.util.*;

class Pet {
    private String type;
    private int age;
    private boolean isAdopted;

    public Pet(String type, int age) {
        this.type = type;
        this.age = age;
        this.isAdopted = false;
    }

    public String getType() { return type; }
    public int getAge() { return age; }
    public boolean isAdopted() { return isAdopted; }

    public void adopt() { isAdopted = true; }

    @Override
    public String toString() {
        return type + " - Age: " + age + " (Adopted: " + isAdopted + ")";
    }
}

class PetPortal<T extends Pet> {
    private List<T> pets = new ArrayList<>();

    public void addPet(T pet) {
        pets.add(pet);
    }

    public List<T> filterPets(String type, int maxAge) {
        List<T> result = new ArrayList<>();
        for (T pet : pets) {
            if (!pet.isAdopted() && pet.getType().equalsIgnoreCase(type) && pet.getAge() <= maxAge) {
                result.add(pet);
            }
        }
        return result;
    }
}

public class PetAdoption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetPortal<Pet> portal = new PetPortal<>();

        while (true) {
            System.out.println("\n1. Add Pet\n2. Filter Pets\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Pet Type: ");
                String type = sc.nextLine();
                System.out.print("Enter Pet Age: ");
                int age = sc.nextInt();
                portal.addPet(new Pet(type, age));
            } else if (choice == 2) {
                System.out.print("Enter Type to Filter: ");
                String type = sc.nextLine();
                System.out.print("Enter Max Age: ");
                int age = sc.nextInt();
                List<Pet> filtered = portal.filterPets(type, age);
                System.out.println("Available Pets:");
                filtered.forEach(System.out::println);
            } else {
                break;
            }
        }
        sc.close();
    }
}
