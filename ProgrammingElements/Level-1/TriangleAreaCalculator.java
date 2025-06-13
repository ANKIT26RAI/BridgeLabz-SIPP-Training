package com.studyopedia;
import java.util.*;
public class TriangleAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = input.nextDouble();
        
        double areaInches = 0.5 * baseInches * heightInches;
        
        double areaCm = areaInches * (2.54 * 2.54);

        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");
        
        input.close();

	}

}
