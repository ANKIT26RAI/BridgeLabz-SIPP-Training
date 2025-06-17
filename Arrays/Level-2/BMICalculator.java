package com.studyopedia.Arrays.Level2;
import java.util.*;
public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of persons: ");
	        int n = scanner.nextInt();

	        double[] weights = new double[n];
	        double[] heights = new double[n];
	        double[] bmis = new double[n];
	        String[] status = new String[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nPerson " + (i + 1) + ":");

	            System.out.print("Enter weight in kg: ");
	            weights[i] = scanner.nextDouble();

	            System.out.print("Enter height in meters: ");
	            heights[i] = scanner.nextDouble();
	        }

	        for (int i = 0; i < n; i++) {
	            bmis[i] = weights[i] / (heights[i] * heights[i]);

	            if (bmis[i] <= 18.4) {
	                status[i] = "Underweight";
	            } else if (bmis[i] <= 24.9) {
	                status[i] = "Normal";
	            } else if (bmis[i] <= 39.9) {
	                status[i] = "Overweight";
	            } else {
	                status[i] = "Obese";
	            }
	        }

	        System.out.println("\n--- BMI Report ---");
	        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], status[i]);
	        }

	        scanner.close();

	}

}
