package com.studyopedia.ObjectOrientedDesignPrinciples;

import java.util.*;

class Subject {
 private String name;
 private int marks;

 public Subject(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }

 public String getName() {
     return name;
 }

 public int getMarks() {
     return marks;
 }
}

class GradeCalculator {
 public String calculateGrade(Student student) {
     int total = 0;
     for (Subject subject : student.getSubjects()) {
         total += subject.getMarks();
     }

     int average = total / student.getSubjects().size();

     if (average >= 90) return "A";
     else if (average >= 80) return "B";
     else if (average >= 70) return "C";
     else if (average >= 60) return "D";
     else return "F";
 }
}

class Student {
 private String name;
 private List<Subject> subjects;

 public Student(String name, List<Subject> subjects) {
     this.name = name;
     this.subjects = subjects;
 }

 public List<Subject> getSubjects() {
     return subjects;
 }

 public void requestGrade() {
     GradeCalculator calculator = new GradeCalculator();
     String grade = calculator.calculateGrade(this);
     System.out.println("Student: " + name + ", Grade: " + grade);
 }
}

public class SchoolResultsApp {
 public static void main(String[] args) {
     Subject maths = new Subject("Maths", 90);
     Subject science = new Subject("Science", 85);

     Student john = new Student("Ankit Rai", Arrays.asList(maths, science));
     john.requestGrade(); 
 }
}
