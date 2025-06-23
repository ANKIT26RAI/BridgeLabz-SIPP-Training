package com.studyopedia.BuiltInFunctions;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        if (isPalindrome(input))
            System.out.println("It's a Palindrome.");
        else
            System.out.println("Not a Palindrome.");
    }

    static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
