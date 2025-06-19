package com.studyopedia.Strings.Level3;
import java.util.*;
public class FirstNonReapeatChar {
    public static char getFirstNonRepeatingChar(String str) {
        int[] freq = new int[256]; // ASCII character frequency

        // First pass: count character frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Second pass: find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = getFirstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }


	

}
