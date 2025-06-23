package com.studyopedia.BuiltInFunctions;
import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convert: 1) C to F  2) F to C\nEnter choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1)
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        else
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
