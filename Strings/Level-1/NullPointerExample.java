package com.studyopedia.Strings.Level1;
import java.util.*;
public class NullPointerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        generateException();
	        handleException();
	    }

	    public static void generateException() {
	        String text = null;
	    }

	    public static void handleException() {
	        try {
	            String text = null;
	            System.out.println(text.length());
	        } catch (NullPointerException e) {
	            System.out.println("Handled NullPointerException!");

	}
	        }

}
