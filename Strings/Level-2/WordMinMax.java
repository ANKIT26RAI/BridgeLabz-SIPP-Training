package com.studyopedia.Strings.Level2;
import java.util.*;
public class WordMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        System.out.println("Enter text:");
	        String text = sc.nextLine();

	        String[] words = ManualSplit.manualSplit(text);
	        String[][] wordLengths = new String[words.length][2];

	        for (int i = 0; i < words.length; i++) {
	            wordLengths[i][0] = words[i];
	            wordLengths[i][1] = String.valueOf(StringLength.getLength(words[i]));
	        }

	        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	        String shortest = "", longest = "";

	        for (String[] pair : wordLengths) {
	            int len = Integer.parseInt(pair[1]);
	            if (len < min) {
	                min = len;
	                shortest = pair[0];
	            }
	            if (len > max) {
	                max = len;
	                longest = pair[0];
	            }
	        }

	        System.out.println("Shortest Word: " + shortest + " (" + min + ")");
	        System.out.println("Longest Word: " + longest + " (" + max + ")");
	    

	}

}
