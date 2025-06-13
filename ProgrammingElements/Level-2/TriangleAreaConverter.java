package com.studyopedia.level2;
import java.util.*;
public class TriangleAreaConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        float base = scanner.nextFloat();
        System.out.print("Enter the height of the triangle in cm: ");
        float height = scanner.nextFloat();
        float areaCm = 0.5f * base * height;
        float baseInches = base / 2.54f;
        float heightInches = height / 2.54f;
        float areaInches = 0.5f * baseInches * heightInches;
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaInches, areaCm);
        scanner.close();

	}

}
