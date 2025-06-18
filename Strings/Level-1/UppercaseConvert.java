package com.studyopedia.Strings.Level1;
import java.util.*;
public class UppercaseConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String input = sc.nextLine();

	        String manual = toUpperCaseManual(input);
	        String builtin = input.toUpperCase();

	        System.out.println("Manual Uppercase: " + manual);
	        System.out.println("Built-in Uppercase: " + builtin);
	        System.out.println("Are both same? " + manual.equals(builtin));
	    }

	    public static String toUpperCaseManual(String s) {
	        String result = "";
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                result += (char)(ch - 32);
	            } else {
	                result += ch;
	            }
	        }
	        return result;
	    

	}

}
