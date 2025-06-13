package com.studyopedia.level2;
import java.util.*;
public class SquareSideFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the perimeter of the square: ");
	        float perimeter = scanner.nextFloat();
	        float side = perimeter / 4;
	        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);
	        scanner.close();

	}

}
