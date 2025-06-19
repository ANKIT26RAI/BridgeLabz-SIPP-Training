package com.studyopedia.Strings.Level2;
import java.util.*;

public class StudentGradeCalculator {

    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + rand.nextInt(90);
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    public static char[] calculateGrades(double[][] stats) {
        int n = stats.length;
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            double percent = stats[i][2];
            if (percent >= 80) grades[i] = 'A';
            else if (percent >= 70) grades[i] = 'B';
            else if (percent >= 60) grades[i] = 'C';
            else if (percent >= 50) grades[i] = 'D';
            else if (percent >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, char[] grades) {
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-12s %-8s\n",
                "ID", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-8c\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5;
        int[][] scores = generateScores(numberOfStudents);
        double[][] stats = calculateStats(scores);
        char[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}
