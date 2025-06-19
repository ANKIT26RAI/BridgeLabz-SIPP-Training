package com.studyopedia.Strings.Level3;
import java.util.*;
public class UniqueFreq {
		    public static int getLength(String str) {
	        int count = 0;
	        try {
	            while (true) {
	                str.charAt(count);
	                count++;
	            }
	        } catch (IndexOutOfBoundsException e) {
	            // reached end
	        }
	        return count;
	    }

	    // Method to find unique characters in the string
	    public static char[] getUniqueCharacters(String str) {
	        int len = getLength(str);
	        char[] temp = new char[len];
	        int index = 0;

	        for (int i = 0; i < len; i++) {
	            char current = str.charAt(i);
	            boolean isUnique = true;
	            for (int j = 0; j < i; j++) {
	                if (str.charAt(j) == current) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                temp[index++] = current;
	            }
	        }

	        char[] result = new char[index];
	        for (int i = 0; i < index; i++) {
	            result[i] = temp[i];
	        }
	        return result;
	    }

	    // Method to get frequencies using only the unique characters
	    public static String[][] getCharFrequencies(String str) {
	        int[] freq = new int[256];
	        int len = getLength(str);

	        for (int i = 0; i < len; i++) {
	            freq[str.charAt(i)]++;
	        }

	        char[] uniqueChars = getUniqueCharacters(str);
	        String[][] output = new String[uniqueChars.length][2];

	        for (int i = 0; i < uniqueChars.length; i++) {
	            char ch = uniqueChars[i];
	            output[i][0] = String.valueOf(ch);
	            output[i][1] = String.valueOf(freq[ch]);
	        }

	        return output;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String[][] result = getCharFrequencies(input);

	        System.out.println("Character frequencies:");
	        for (String[] row : result) {
	            System.out.println(row[0] + " => " + row[1]);
	        }
	 
	}

}
