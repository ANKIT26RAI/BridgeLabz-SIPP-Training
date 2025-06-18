package com.studyopedia.JavaMethods.Level1;
import java.util.*;
public class SmallestAndLargest {
	
	public static int[] smallLarge(int num1, int num2,int num3) {
		int small=Math.min(num1, Math.min(num2, num3));
		int large= Math.max(num1, Math.max(num2, num3));
		return new int[] {small,large};
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 Numbers : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int[] result = smallLarge(num1,num2,num3);
		System.out.println("Smallest : " + result[0]);
		System.out.println("Largest : " + result[1]);



		

	}

}
