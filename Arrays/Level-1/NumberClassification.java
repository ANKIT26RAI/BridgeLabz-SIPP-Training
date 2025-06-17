package com.studyopedia.Arrays.Level1;
import java.util.*;
public class NumberClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " is positive and ");
                System.out.println((numbers[i] % 2 == 0) ? "even." : "odd.");
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println("Number is zero.");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last.");
        } else {
            System.out.println("First element is less than the last.");
        }

	}

}
