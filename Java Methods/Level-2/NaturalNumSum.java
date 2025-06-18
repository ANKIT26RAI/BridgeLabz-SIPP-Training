package com.studyopedia.JavaMethods.Level2;
import java.util.Scanner;

public class NaturalNumSum {

    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a positive natural number.");
        } else {
            int sumRecursion = sumRecursive(n);
            int sumFormulaResult = sumFormula(n);

            System.out.println("Sum using recursion: " + sumRecursion);
            System.out.println("Sum using formula: " + sumFormulaResult);

            if (sumRecursion == sumFormulaResult) {
                System.out.println("Both calculations match!");
            } else {
                System.out.println("Mismatch found. There may be an issue.");
            }
        }

        sc.close();
    }
}