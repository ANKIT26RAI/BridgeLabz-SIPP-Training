package com.studyopedia.JavaMethods.Level1;

import java.util.Scanner;

public class HandShakes {
	public static int CalculateHS(int n) {
		return (n * (n - 1)) / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n = sc.nextInt();
		
		int handshakes = CalculateHS(n);
        System.out.println("Maximum number of possible handshakes: " + handshakes);


	}

}
