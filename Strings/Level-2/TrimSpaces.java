package com.studyopedia.Strings.Level2;
import java.util.*;
public class TrimSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter string with leading and trailing spaces:");
	        String str = sc.nextLine();

	        int[] indexes = findTrimIndexes(str);
	        String trimmed = substring(str, indexes[0], indexes[1]);
	        String builtIn = str.trim();

	        System.out.println("Manual Trim: [" + trimmed + "]");
	        System.out.println("Built-in Trim: [" + builtIn + "]");
	        System.out.println("Are equal: " + compareStrings(trimmed, builtIn));
	    }

	    public static int[] findTrimIndexes(String str) {
	        int start = 0, end = StringLength.getLength(str) - 1;
	        while (str.charAt(start) == ' ') start++;
	        while (str.charAt(end) == ' ') end--;
	        return new int[]{start, end + 1};
	    }

	    public static String substring(String str, int start, int end) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = start; i < end; i++) sb.append(str.charAt(i));
	        return sb.toString();
	    }

	    public static boolean compareStrings(String a, String b) {
	        if (StringLength.getLength(a) != StringLength.getLength(b)) return false;
	        for (int i = 0; i < StringLength.getLength(a); i++) {
	            if (a.charAt(i) != b.charAt(i)) return false;
	        }
	        return true;

	}

}
