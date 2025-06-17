package com.studyopedia.Arrays.Level1;
import java.util.*;
public class ZaraBonusCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final int EMPLOYEES = 10;
	        double[] salary = new double[EMPLOYEES];
	        double[] yearsOfService = new double[EMPLOYEES];
	        double[] bonus = new double[EMPLOYEES];
	        double[] newSalary = new double[EMPLOYEES];

	        double totalOldSalary = 0;
	        double totalBonus = 0;
	        double totalNewSalary = 0;

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter salary and years of service for 10 employees:");

	        for (int i = 0; i < EMPLOYEES; i++) {
	            System.out.println("\nEmployee " + (i + 1) + ":");

	            System.out.print("Enter salary: ");
	            salary[i] = scanner.nextDouble();
	            if (salary[i] <= 0) {
	                System.out.println("Invalid salary. Please enter again.");
	                i--; 
	                continue;
	            }

	            System.out.print("Enter years of service: ");
	            yearsOfService[i] = scanner.nextDouble();
	            if (yearsOfService[i] < 0) {
	                System.out.println("Invalid years of service. Please enter again.");
	                i--; 
	                continue;
	            }
	        }

	        for (int i = 0; i < EMPLOYEES; i++) {
	            if (yearsOfService[i] > 5) {
	                bonus[i] = 0.05 * salary[i];
	            } else {
	                bonus[i] = 0.02 * salary[i];
	            }

	            newSalary[i] = salary[i] + bonus[i];

	            totalOldSalary += salary[i];
	            totalBonus += bonus[i];
	            totalNewSalary += newSalary[i];
	        }

	        System.out.println("\n--- Employee Salary and Bonus Details ---");
	        for (int i = 0; i < EMPLOYEES; i++) {
	            System.out.printf("Employee %d | Old Salary: %.2f | Years of Service: %.1f | Bonus: %.2f | New Salary: %.2f\n",
	                    (i + 1), salary[i], yearsOfService[i], bonus[i], newSalary[i]);
	        }

	        // Totals
	        System.out.printf("\nTotal Old Salary of All Employees: %.2f\n", totalOldSalary);
	        System.out.printf("Total Bonus Paid by Zara: %.2f\n", totalBonus);
	        System.out.printf("Total New Salary of All Employees: %.2f\n", totalNewSalary);

	        scanner.close();
	    }

	}


