package com.studyopedia.Strings.Level1;
import java.util.*;
public class NumberFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number string: ");
        String s = sc.next();

        // generateException(s); // Uncomment to crash
        handleException(s);
    }

    public static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println("Number: " + num);
    }

    public static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException!");
        }

	}

}
