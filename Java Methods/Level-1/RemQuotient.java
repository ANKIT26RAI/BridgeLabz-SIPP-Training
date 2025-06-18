package com.studyopedia.JavaMethods.Level1;
import java.util.*;

public class RemQuotient {
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int rem = number%divisor;
		int quotient = number /divisor;
		return new int[] {rem,quotient};
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : "  );
		int number = sc.nextInt();
		System.out.print("Enter the divisor : "  );
		int divisor = sc.nextInt();
		
		int[] result = findRemainderAndQuotient(number,divisor);
		System.out.println("Remainder : " + result[0]);
		System.out.println("Quotient : " + result[1]);


		
	}


}
