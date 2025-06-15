package com.studyopediaControlFlows.level2;
import java.util.*;
public class FactorsFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive number: ");
	        int number = sc.nextInt();

	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                System.out.println(i);
	            }
	            }

	}

}
