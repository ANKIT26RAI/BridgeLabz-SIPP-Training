package com.studyopedia.JavaMethods.Level3;

import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for 3 points:");
        System.out.print("Point A - x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Point A - y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Point B - x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Point B - y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Point C - x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Point C - y3: ");
        double y3 = scanner.nextDouble();

        System.out.println("\nPoints: A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), C(" + x3 + ", " + y3 + ")");

        boolean collinearBySlope = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by Slope Formula: " + collinearBySlope);
        System.out.println("Collinear by Area Formula: " + collinearByArea);

        if (collinearBySlope && collinearByArea) {
            System.out.println("The three points are COLLINEAR");
        } else {
            System.out.println("The three points are NOT COLLINEAR");
        }

        scanner.close();
    }

    public static boolean isCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return Math.abs(slopeAB - slopeBC) < 0.0001 && Math.abs(slopeBC - slopeAC) < 0.0001;
    }

    public static boolean isCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area < 0.0001;
    }
}