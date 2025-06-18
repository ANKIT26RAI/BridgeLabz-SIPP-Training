package com.studyopedia.Strings.Level1;
import java.util.Scanner;
public class IllegalArgumentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();

        generateException(s); 
        handleException(s);
    }

    public static void generateException(String s) {
        System.out.println(s.substring(5, 2));
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException!");
        }
    }

	}


