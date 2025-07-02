package MultilevelInheritance.SampleProblem2;

public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String name, int duration, String platform, boolean recorded, double fee, double discount) {
        super(name, duration, platform, recorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayDetails() {
        System.out.println("Course: " + courseName + ", Platform: " + platform + ", Fee: $" + fee + ", Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java Mastery", 6, "Udemy", true, 499.0, 20.0);
        p.displayDetails();
    }
}
