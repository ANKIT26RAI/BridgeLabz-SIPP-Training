package com.studyopedia;
import java.util.*;
public class HeightConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter your height in centimeters: ");
	        double heightCm = input.nextDouble();
	        
	        double heightInches = heightCm / 2.54;
	        
	        int feet = (int)(heightInches / 12);
	        double inches = heightInches % 12;

	        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
	        
	        input.close();

	}

}
