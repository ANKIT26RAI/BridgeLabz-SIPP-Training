package com.studyopedia.JavaMethods.Level2;
import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compareNumbers(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            System.out.println(num + " is " + (isPositive(num) ? "positive" : "negative") + 
                               " and " + (isEven(num) ? "even." : "odd."));
        }

        int comparison = compareNumbers(numbers[0], numbers[4]);
        if (comparison > 0) {
            System.out.println("First number is greater than last number.");
        } else if (comparison < 0) {
            System.out.println("First number is smaller than last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

        sc.close();
    }
}