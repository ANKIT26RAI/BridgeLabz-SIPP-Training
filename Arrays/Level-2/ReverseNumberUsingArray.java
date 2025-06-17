package com.studyopedia.Arrays.Level2;
import java.util.*;
public class ReverseNumberUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
                scanner.next(); 
            }
        }

        int temp = number;
        int digitCount = 0;

        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];

        temp = number;
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }

        System.out.println("\n--- Result ---");
        System.out.print("Original Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.print("\nReversed Digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }

        System.out.print("\nReversed Number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }

        scanner.close();

	}

}
