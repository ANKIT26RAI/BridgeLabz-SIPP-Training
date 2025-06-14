package com.studyopediaControlFlows.level1;

import java.util.Scanner;

public class NumberType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		if(number>0) {
			System.out.println("Positive");
		}else if(number<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
	}

}
