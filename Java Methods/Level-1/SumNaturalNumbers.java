package com.studyopedia.JavaMethods.Level1;
import java.util.*;
public class SumNaturalNumbers {
	public static int sumNaturalNums(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) 
			sum+=i;
			return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the natural number : ");
		int n = sc.nextInt();
		System.out.println("Sum of n Natural numbers : " + sumNaturalNums(n));
	}

}

