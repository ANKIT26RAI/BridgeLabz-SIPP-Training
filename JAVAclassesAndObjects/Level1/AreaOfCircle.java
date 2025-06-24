package com.studyopedia.JavaClassandObject.Level1;


public class AreaOfCircle {
    double radius;

    public AreaOfCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        AreaOfCircle circle = new AreaOfCircle(5.0);
        circle.display();
    }
}

