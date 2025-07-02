package inheritance.HybridInheritance.SampleProblem2;


public class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int speed, String model) {
        super(speed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling at petrol station.");
    }

    public static void main(String[] args) {
        PetrolVehicle pv = new PetrolVehicle(180, "Maruti");
        pv.refuel();
    }
}

