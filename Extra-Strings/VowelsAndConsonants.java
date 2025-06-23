package com.studyopedia.StringExtras;

import java.util.*;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        countVowelsAndConsonants(input);
    }

    static void countVowelsAndConsonants(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

