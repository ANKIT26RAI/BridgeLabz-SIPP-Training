package com.studyopedia.JavaMethods.Level1;
import java.util.*;
public class NumberSign {

	public static int checkSign(int number) {
		if (number>0) return 1;
		else if (number<0) return -1;
		else  return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Sign : "+ checkSign(number));
	}

}
