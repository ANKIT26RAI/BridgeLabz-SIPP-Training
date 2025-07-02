package inheritance.HybridInheritance;

public class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member in the " + department + " department.");
    }

    public static void main(String[] args) {
        Staff staff = new Staff("Rahul", 35, "Administration");
        staff.displayRole();
    }
}
