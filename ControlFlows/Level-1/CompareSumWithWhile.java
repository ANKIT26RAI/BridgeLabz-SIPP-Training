package com.studyopediaControlFlows.level1;
import java.util.*;
public class CompareSumWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        if (n >= 1) {
	            int sum = 0, i = 1;
	            while (i <= n) {
	                sum += i;
	                i++;
	            }
	            int formula = n * (n + 1) / 2;
	            System.out.println("While loop sum: " + sum);
	            System.out.println("Formula sum: " + formula);
	            System.out.println("Are they equal? " + (sum == formula));
	        } else {
	            System.out.println("Not a natural number");
	        }
		
}

}
