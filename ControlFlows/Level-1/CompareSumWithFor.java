package com.studyopediaControlFlows.level1;
import java.util.*;
public class CompareSumWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        if (n >= 1) {
	            int sum = 0;
	            for (int i = 1; i <= n; i++) {
	                sum += i;
	            }
	            int formula = n * (n + 1) / 2;
	            System.out.println("For loop sum: " + sum);
	            System.out.println("Formula sum: " + formula);
	            System.out.println("Are they equal? " + (sum == formula));
	        } else {
	            System.out.println("Not a natural number");
	        }

	}

}
