package com.studyopedia.JavaMethods.Level1;
import java.util.*;
public class WindChill {
	
	public static double calculateWindChill(double temp, double windSpeed) {
		double windChill = 35.74 + (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature : ");
		double temp = sc.nextDouble();
		System.out.println("Enter the WindSpeed : ");
		double windSpeed = sc.nextDouble();
		double result = calculateWindChill(temp,windSpeed);
		System.out.println("WindChill : " + result);
		
		

		

	}

}
