package com.studyopedia.Arrays.Level2;
import java.util.*;
public class YoungestAndTallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();

            if (ages[i] <= 0) {
                System.out.println("Invalid age. Please enter again.");
                i--;
                continue;
            }

            System.out.print("Height (in cm): ");
            heights[i] = scanner.nextDouble();

            if (heights[i] <= 0) {
                System.out.println("Invalid height. Please enter again.");
                i--;
            }
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\n--- Result ---");
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        scanner.close();
    

	}

}
