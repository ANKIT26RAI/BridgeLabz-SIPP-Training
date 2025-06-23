package com.studyopedia.BuiltInFunctions;
import java.util.*;

public class FactRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
