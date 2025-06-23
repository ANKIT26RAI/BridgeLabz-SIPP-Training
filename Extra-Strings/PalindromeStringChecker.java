package com.studyopedia.StringExtras;
public class PalindromeStringChecker {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not a Palindrome");
    }

    static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r)
            if (str.charAt(l++) != str.charAt(r--)) return false;
        return true;
    }
}

