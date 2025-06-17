package com.studyopedia.Arrays.Level2;
import java.util.*;
public class StudentGrades2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Step a: Take input for number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3]; // Each row: [physics, chemistry, maths]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = switch (j) {
                    case 0 -> "Physics";
                    case 1 -> "Chemistry";
                    case 2 -> "Maths";
                    default -> "Unknown";
                };

                while (true) {
                    System.out.print("Enter marks in " + subject + ": ");
                    int mark = scanner.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid input! Enter marks between 0 and 100.");
                    } else {
                        marks[i][j] = mark;
                        break;
                    }
                }
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s %-10s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-15.2f %-10c\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        scanner.close();

	}

}
