package inheritance.HierarchicalInheritance.SampleProblem2;
public class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher. Subject: " + subject);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Ankit", 30, "Math");
        t.displayRole();
    }
}

