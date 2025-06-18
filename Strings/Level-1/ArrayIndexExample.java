package com.studyopedia.Strings.Level1;
import java.util.*;
public class ArrayIndexExample {

		 public static void main(String[] args) {
		        String[] names = {"Alice", "Bob", "Charlie"};

		        // generateException(names); // Uncomment to crash
		        handleException(names);
		    }

		    public static void generateException(String[] arr) {
		        System.out.println(arr[10]);
		    }

		    public static void handleException(String[] arr) {
		        try {
		            System.out.println(arr[10]);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Handled ArrayIndexOutOfBoundsException!");
		        }

	}

}
