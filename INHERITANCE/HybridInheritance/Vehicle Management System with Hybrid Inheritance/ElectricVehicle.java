package inheritance.HybridInheritance.SampleProblem2;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int speed, String model) {
        super(speed, model);
    }

    void charge() {
        System.out.println(model + " is charging at the EV station.");
    }

    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        ev.charge();
    }
}

