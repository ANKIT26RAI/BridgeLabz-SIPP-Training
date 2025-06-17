package com.studyopedia.Arrays.Level2;
import java.util.*;
public class LargestDigitsReworked {
	public static void main(String[] args) {
		int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");

        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.print("Please enter a number greater than 0: ");
                }
            } else {
                System.out.print("Invalid input. Enter a valid number: ");
                scanner.next(); // clear invalid input
            }
        }

        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index++] = number % 10;
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
        System.out.print("Digits stored: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest Digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second Largest Digit: " + secondLargest);
        } else {
            System.out.println("Second Largest Digit not found (all digits may be the same).");
        }

        scanner.close();
	}

}
