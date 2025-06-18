package com.studyopedia.JavaMethods.Level2;
import java.util.Scanner;

public class QuadraticSolver {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta > 0) {
            return new double[]{(-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)};
        }
        if (delta == 0) {
            return new double[]{-b / (2 * a)};
        }
        return new double[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else {
            for (int i = 0; i < roots.length; i++) {
                System.out.printf("Root %d: %.2f%n", i + 1, roots[i]);
            }
        }

        sc.close();
    }
}