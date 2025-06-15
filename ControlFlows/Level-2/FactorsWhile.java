package com.studyopediaControlFlows.level2;
import java.util.*;
public class FactorsWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

	}


