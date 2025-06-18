package com.studyopedia.Strings.Level1;
import java.util.*;
public class StringIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = sc.next();

	        handleException(s);
	    }

	    public static void generateException(String s) {
	        System.out.println(s.charAt(100)); 
	    }

	    public static void handleException(String s) {
	        try {
	            System.out.println(s.charAt(100));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Handled StringIndexOutOfBoundsException!");
	        }

	}

}
