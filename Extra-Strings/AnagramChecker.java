package com.studyopedia.StringExtras;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        System.out.println(areAnagrams(s1, s2) ? "Anagrams" : "Not Anagrams");
    }

    static boolean areAnagrams(String s1, String s2) {
        char[] a1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] a2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}

