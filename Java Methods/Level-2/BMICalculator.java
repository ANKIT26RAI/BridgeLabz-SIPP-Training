package com.studyopedia.JavaMethods.Level2;
import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        height /= 100; // Convert cm to meters
        return weight / (height * height);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal weight";
        if (bmi < 29.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmiData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = sc.nextDouble();
            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f (%s)%n",
                              i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], getBMIStatus(bmiData[i][2]));
        }

        sc.close();
    }
}
