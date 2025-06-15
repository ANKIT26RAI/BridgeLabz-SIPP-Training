package com.studyopediaControlFlows.level2;
import java.util.*;
public class GreatestFactorWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int counter = number - 1;
        int greatestFactor = 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor: " + greatestFactor);
    

	}

}
