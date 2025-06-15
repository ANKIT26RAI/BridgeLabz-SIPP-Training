package com.studyopediaControlFlows.level2;
import java.util.*;
public class MultiplesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

	}

}
