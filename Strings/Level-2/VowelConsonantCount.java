package com.studyopedia.Strings.Level2;
import java.util.*;
public class VowelConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();

        int[] result = countVC(str);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    public static int[] countVC(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = str.charAt(i);
                String type = charType(ch);
                if (type.equals("Vowel")) vowels++;
                else if (type.equals("Consonant")) consonants++;
            } catch (Exception e) {
                break;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static String charType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        }
        return "Not a Letter";

	}

}
