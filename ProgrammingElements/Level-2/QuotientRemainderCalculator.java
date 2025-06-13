package com.studyopedia.level2;
import java.util.*;
public class QuotientRemainderCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n", quotient, remainder, number1, number2);
        scanner.close();

	}

}
