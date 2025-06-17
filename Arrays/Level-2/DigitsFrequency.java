package com.studyopedia.Arrays.Level2;
import java.util.*;
public class DigitsFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        long number = scanner.nextLong();

	        if (number < 0) {
	            number = -number;
	        }

	        int[] digits = new int[20];
	        int index = 0;

	        long temp = number;
	        while (temp > 0) {
	            digits[index++] = (int)(temp % 10); 
	            temp /= 10;
	        }

	        int[] frequency = new int[10];

	        for (int i = 0; i < index; i++) {
	            frequency[digits[i]]++;
	        }

	        System.out.println("\nDigit Frequency in number " + number + ":");
	        for (int i = 0; i < 10; i++) {
	            if (frequency[i] > 0) {
	                System.out.println("Digit " + i + " => " + frequency[i] + " time(s)");
	            }
	        }

	        scanner.close();
		

	}

}
