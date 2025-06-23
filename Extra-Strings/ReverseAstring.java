package com.studyopedia.StringExtras;
public class ReverseAstring {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Reversed: " + reverseString(input));
    }

    static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reversed += str.charAt(i);
        return reversed;
    }
}
