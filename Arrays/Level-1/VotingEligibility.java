package com.studyopedia.Arrays.Level1;
import java.util.*;
public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int[] ages = new int[10];

	        for (int i = 0; i < ages.length; i++) {
	            System.out.print("Enter age of student " + (i + 1) + ": ");
	            ages[i] = sc.nextInt();

	            if (ages[i] < 0) {
	                System.out.println("Invalid age!");
	            } else if (ages[i] >= 18) {
	                System.out.println("The student with age " + ages[i] + " can vote.");
	            } else {
	                System.out.println("The student with age " + ages[i] + " cannot vote.");
	            

	            }
	            }
	        }

}
