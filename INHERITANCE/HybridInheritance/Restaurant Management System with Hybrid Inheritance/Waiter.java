package inheritance.HybridInheritance;


public class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food and taking orders.");
    }

    public static void main(String[] args) {
        Waiter waiter = new Waiter("Ravi", 202);
        waiter.performDuties();
    }
}
