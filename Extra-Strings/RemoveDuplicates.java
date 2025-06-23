package com.studyopedia.StringExtras;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Modified: " + removeDuplicates(input));
    }

    static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }
}

