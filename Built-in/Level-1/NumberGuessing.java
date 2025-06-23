package com.studyopedia.BuiltInFunctions;

import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;
        while (low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (low/high/correct)");
            String feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it right!");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Please enter 'low', 'high', or 'correct'.");
            }
        }

        sc.close();
    }

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }
}