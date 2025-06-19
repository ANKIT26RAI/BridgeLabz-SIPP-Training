package com.studyopedia.Strings.Level3;
import java.util.Scanner;
public class NestedFreq {
		    public static String[] getFrequencyArray(String str) {
	        char[] chars = str.toCharArray();
	        int[] freq = new int[chars.length];

	        for (int i = 0; i < chars.length; i++) {
	            freq[i] = 1;
	            if (chars[i] == '0') continue;

	            for (int j = i + 1; j < chars.length; j++) {
	                if (chars[i] == chars[j]) {
	                    freq[i]++;
	                    chars[j] = '0'; // mark as counted
	                }
	            }
	        }

	        int resultSize = 0;
	        for (char ch : chars) {
	            if (ch != '0') resultSize++;
	        }

	        String[] result = new String[resultSize];
	        int index = 0;
	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] != '0') {
	                result[index++] = chars[i] + " => " + freq[i];
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String[] frequencies = getFrequencyArray(input);

	        System.out.println("Character frequencies:");
	        for (String entry : frequencies) {
	            System.out.println(entry);
	        }	   
	        sc.close();

	    }
	
}
