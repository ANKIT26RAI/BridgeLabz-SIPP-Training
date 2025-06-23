package com.studyopedia.StringExtras;
public class removestr {
    public static void main(String[] args) {
        String input = "Hello World";
        char toRemove = 'l';
        System.out.println("Modified: " + removeChar(input, toRemove));
    }

    static String removeChar(String str, char ch) {
        return str.replaceAll(String.valueOf(ch), "");
    }
}
