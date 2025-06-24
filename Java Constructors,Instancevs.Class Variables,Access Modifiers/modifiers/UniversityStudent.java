package com.studyopedia.OOPS.modifiers;

public class UniversityStudent {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends UniversityStudent {
    void displayInfo() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name);
    }
}
