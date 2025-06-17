package com.studyopedia.Arrays.Level2;
import java.util.Scanner;
public class LargestDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int maxDigit = 10;
	        int[] digits = new int[maxDigit];
	        int index = 0;

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number <= 0) {
	            System.out.println("Please enter a positive number.");
	            return;
	        }

	        while (number != 0) {
	            int digit = number % 10;
	            digits[index] = digit;
	            index++;

	            if (index == maxDigit) {
	                System.out.println("Maximum of 10 digits stored. Remaining digits will be ignored.");
	                break;
	            }

	            number = number / 10;
	        }

	        int largest = -1;
	        int secondLargest = -1;

	        for (int i = 0; i < index; i++) {
	            if (digits[i] > largest) {
	                secondLargest = largest;
	                largest = digits[i];
	            } else if (digits[i] > secondLargest && digits[i] != largest) {
	                secondLargest = digits[i];
	            }
	        }

	        System.out.println("\n--- Result ---");
	        System.out.println("Digits stored: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(digits[i] + " ");
	        }

	        System.out.println("\nLargest Digit: " + largest);
	        if (secondLargest != -1) {
	            System.out.println("Second Largest Digit: " + secondLargest);
	        } else {
	            System.out.println("Second Largest Digit not found (all digits are the same).");
	        }

	        scanner.close();

	}

}
