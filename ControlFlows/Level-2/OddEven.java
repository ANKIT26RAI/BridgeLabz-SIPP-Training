package com.studyopediaControlFlows.level2;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if(n<1) {
			System.out.println("Please enter a natural number greater than 0.");
			
		}
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
                System.out.println(i + " is Even");
         }else {
             System.out.println(i + " is Odd");

         }
			
		}

	}

}
