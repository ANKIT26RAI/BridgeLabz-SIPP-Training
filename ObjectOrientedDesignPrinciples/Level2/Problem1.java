package com.studyopedia.ObjectOrientedDesignPrinciples.Level2;

import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name + " | Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " | Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void admitStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + name + " | Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter school name: ");
        String schoolName = sc.nextLine();
        School school = new School(schoolName);

        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            Student s = new Student(name);
            students.add(s);
            school.admitStudent(s);
        }

        System.out.print("Enter number of courses: ");
        int courseCount = sc.nextInt();
        sc.nextLine();

        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < courseCount; i++) {
            System.out.print("Enter name of course " + (i + 1) + ": ");
            String cname = sc.nextLine();
            courses.add(new Course(cname));
        }

        for (Student s : students) {
            System.out.print("Enter number of courses " + s.getName() + " wants to enroll in: ");
            int enrollCount = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < enrollCount; j++) {
                System.out.print("Enter course name: ");
                String cname = sc.nextLine();
                for (Course c : courses) {
                    if (c.getName().equalsIgnoreCase(cname)) {
                        s.enroll(c);
                    }
                }
            }
        }

        school.showStudents();
        for (Student s : students) s.viewCourses();
        for (Course c : courses) c.showEnrolledStudents();

        sc.close();
    }
}
