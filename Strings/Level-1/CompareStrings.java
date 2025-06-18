package com.studyopedia.Strings.Level1;
import java.util.*;
public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first string: ");
	        String s1 = sc.next();
	        System.out.print("Enter second string: ");
	        String s2 = sc.next();

	        boolean resultCharAt = compareUsingCharAt(s1, s2);
	        boolean resultEquals = s1.equals(s2);

	        System.out.println("Comparison using charAt(): " + resultCharAt);
	        System.out.println("Comparison using equals(): " + resultEquals);
	    }

	    public static boolean compareUsingCharAt(String a, String b) {
	        if (a.length() != b.length()) return false;
	        for (int i = 0; i < a.length(); i++) {
	            if (a.charAt(i) != b.charAt(i)) return false;
	        }
	        return true;

	}

}
