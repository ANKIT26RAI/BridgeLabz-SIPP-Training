package com.studyopedia.JavaMethods.Level1;
import java.util.*;
public class TriangularPark {
	public static double completeRounds(double side1,double side2,double side3) {
		double perimeter = side1+side2+side3;
		return 5000/perimeter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter all 3 Side of a Triangle");
		double side1= sc.nextDouble();
		double side2= sc.nextDouble();
		double side3= sc.nextDouble();
		
        System.out.println("Rounds to complete 5km: " + completeRounds(side1, side2, side3));




	}

}
