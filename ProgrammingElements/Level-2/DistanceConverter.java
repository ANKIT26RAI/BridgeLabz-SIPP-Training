package com.studyopedia.level2;
import java.util.*;
public class DistanceConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = scanner.nextFloat();
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.6f%n", distanceInYards, distanceInMiles);
        scanner.close();

	}

}
