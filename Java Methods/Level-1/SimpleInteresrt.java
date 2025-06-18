package com.studyopedia.JavaMethods.Level1;
import java.util.*;
public class SimpleInteresrt {

	public static double CalculateSI(double Principal,double Rate, double Time) {
		return(Principal*Rate*Time)/100;
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal Amount : ");
		double p = sc.nextDouble();
		System.out.print("Enter the Rate : ");
		double r = sc.nextDouble();
		System.out.print("Enter the time : ");
		double t = sc.nextDouble();
		
		double si =CalculateSI(p,r,t);
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate " + r + ", and Time " + t);

	}

}
