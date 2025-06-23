package com.studyopedia.BuiltInFunctions;
import java.util.*;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = getInput(sc, "Enter first number: ");
        int b = getInput(sc, "Enter second number: ");
        int c = getInput(sc, "Enter third number: ");
        System.out.println("Maximum number is: " + findMax(a, b, c));
    }

    static int getInput(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
