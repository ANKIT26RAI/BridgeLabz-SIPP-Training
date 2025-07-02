package inheritance.HybridInheritance;
public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }

    public static void main(String[] args) {
        Chef c = new Chef("Ankit", 101);
        c.performDuties();
    }
}

