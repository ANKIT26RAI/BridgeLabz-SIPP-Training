package com.studyopediaControlFlows.level2;
import java.util.*;
public class MultiplesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive number less than 100: ");
	        int number = sc.nextInt();

	        int counter = 100;
	        while (counter > 0) {
	            if (counter % number == 0) {
	                System.out.println(counter);
	            }
	            counter--;
	        }

	}

}
