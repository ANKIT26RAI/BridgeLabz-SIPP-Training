package com.studyopedia.StringExtras;
public class MostFrequent {
    public static void main(String[] args) {
        String input = "success";
        System.out.println("Most Frequent: " + findMostFrequentChar(input));
    }

    static char findMostFrequentChar(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int max = 0;
        char res = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                res = c;
            }
        }
        return res;
    }
}
