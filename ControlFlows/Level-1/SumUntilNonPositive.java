package com.studyopediaControlFlows.level1;
import java.util.*;
public class SumUntilNonPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        double total = 0.0;

	        while (true) {
	            double val = sc.nextDouble();
	            if (val <= 0) break;
	            total += val;
	        }

	        System.out.println("Total sum: " + total);

	}

}
