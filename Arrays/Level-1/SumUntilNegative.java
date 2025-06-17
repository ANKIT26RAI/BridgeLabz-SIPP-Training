package com.studyopedia.Arrays.Level1;
import java.util.*;
public class SumUntilNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        double[] numbers = new double[10];
	        double total = 0.0;
	        int index = 0;

	        while (true) {
	            System.out.print("Enter number: ");
	            double input = sc.nextDouble();

	            if (input <= 0 || index == 10) break;

	            numbers[index++] = input;
	        }

	        System.out.println("\nNumbers entered:");
	        for (int i = 0; i < index; i++) {
	            System.out.println(numbers[i]);
	            total += numbers[i];
	        }

	        System.out.println("Sum: " + total);

	}

}
