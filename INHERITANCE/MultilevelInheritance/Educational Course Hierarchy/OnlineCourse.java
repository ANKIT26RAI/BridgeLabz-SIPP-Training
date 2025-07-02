package MultilevelInheritance.SampleProblem2;

public class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String name, int duration, String platform, boolean recorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = recorded;
    }
}
