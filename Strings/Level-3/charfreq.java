package com.studyopedia.Strings.Level3;
import java.util.*;
public class charfreq {
	

	    public static char[][] getFrequencyTable(String str) {
	        int[] freq = new int[256];

	        for (int i = 0; i < str.length(); i++) {
	            freq[str.charAt(i)]++;
	        }

	        int count = 0;
	        boolean[] visited = new boolean[256];
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (!visited[ch]) {
	                visited[ch] = true;
	                count++;
	            }
	        }

	        char[][] result = new char[count][2];
	        int index = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (freq[ch] > 0) {
	                result[index][0] = ch;
	                result[index][1] = (char)(freq[ch] + '0');
	                freq[ch] = 0; // prevent duplicates
	                index++;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String text = scanner.nextLine();

	        char[][] frequencies = getFrequencyTable(text);

	        System.out.println("Character frequencies:");
	        for (char[] row : frequencies) {
	            System.out.println(row[0] + " => " + (row[1] - '0'));
	        }
	    }
	

}
