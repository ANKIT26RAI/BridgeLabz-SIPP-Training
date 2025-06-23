package com.studyopedia.StringExtras;
import java.util.*;
public class SubstringOccurence {
	    public static void main(String[] args) {
        String text = "ababababa";
        String sub = "aba";
        System.out.println("Occurrences: " + countOccurrences(text, sub));
    }

    static int countOccurrences(String text, String sub) {
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub))
                count++;
        }
        return count;
    
}
}