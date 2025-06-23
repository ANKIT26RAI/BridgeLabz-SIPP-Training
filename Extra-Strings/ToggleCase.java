package com.studyopedia.StringExtras;

public class ToggleCase {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Toggled: " + toggleCase(input));
    }

    static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                result.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                result.append(Character.toUpperCase(c));
            else
                result.append(c);
        }
        return result.toString();
    }
}

