package com.studyopedia.Strings.Level2;
import java.util.*;
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the string: ");
	        String input = sc.next();

	        int len = getLength(input);

	        System.out.println("Calculated Length: " + len);
	        System.out.println("Built-in Length: " + input.length());
	    }

	    public static int getLength(String str) {
	        int count = 0;
	        try {
	            while (true) {
	                str.charAt(count);
	                count++;
	            }
	        } catch (Exception e) {
	            return count;
	        }
	}

}
