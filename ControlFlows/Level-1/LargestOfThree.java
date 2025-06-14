package com.studyopediaControlFlows.level1;
import java.util.*;
public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int number1 = sc.nextInt();
		System.out.println("Enter number2 : ");
		int number2 = sc.nextInt();
		System.out.println("Enter number3 : ");
		int number3 = sc.nextInt();
		System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));

	}

}
