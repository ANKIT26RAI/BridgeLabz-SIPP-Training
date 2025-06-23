package com.studyopedia.StringExtras;
import java.util.Scanner;
public class LargestWordFinder {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the sentence : ");
        String sentence = sc.nextLine();
        System.out.println("Longest Word: " + findLongestWord(sentence));
    }

    static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words)
            if (word.length() > longest.length())
                longest = word;
        return longest;
    }
}


