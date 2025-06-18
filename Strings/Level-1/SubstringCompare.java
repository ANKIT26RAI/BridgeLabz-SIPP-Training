package com.studyopedia.Strings.Level1;
import java.util.Scanner;
public class SubstringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String s = sc.next();
	        System.out.print("Enter start index: ");
	        int start = sc.nextInt();
	        System.out.print("Enter end index: ");
	        int end = sc.nextInt();

	        String manualSub = substringUsingCharAt(s, start, end);
	        String builtInSub = s.substring(start, end);

	        System.out.println("Manual substring: " + manualSub);
	        System.out.println("Built-in substring: " + builtInSub);
	        System.out.println("Are both substrings equal? " + manualSub.equals(builtInSub));
	    }

	    public static String substringUsingCharAt(String s, int start, int end) {
	        String result = "";
	        for (int i = start; i < end && i < s.length(); i++) {
	            result += s.charAt(i);
	        }
	        return result;

	}

}
