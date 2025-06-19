package com.studyopedia.Strings.Level3;
import java.util.Scanner;
public class Palindrome {
	

	    public static boolean isPalindromeIterative(String str) {
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) return false;
	            start++;
	            end--;
	        }
	        return true;
	    }

	    public static boolean isPalindromeRecursive(String str, int start, int end) {
	        if (start >= end) return true;
	        if (str.charAt(start) != str.charAt(end)) return false;
	        return isPalindromeRecursive(str, start + 1, end - 1);
	    }

	    public static boolean isPalindromeByReversal(String str) {
	        char[] original = str.toCharArray();
	        char[] reversed = reverseWithCharAt(str);
	        for (int i = 0; i < original.length; i++) {
	            if (original[i] != reversed[i]) return false;
	        }
	        return true;
	    }

	    public static char[] reverseWithCharAt(String str) {
	        char[] reversed = new char[str.length()];
	        int j = 0;
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed[j++] = str.charAt(i);
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String input = scanner.nextLine();

	        boolean result1 = isPalindromeIterative(input);
	        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
	        boolean result3 = isPalindromeByReversal(input);

	        System.out.println("\nResults:");
	        System.out.println("Logic 1 (Iterative check): " + result1);
	        System.out.println("Logic 2 (Recursive check): " + result2);
	        System.out.println("Logic 3 (Char array comparison): " + result3);
	    
	
	}

}
