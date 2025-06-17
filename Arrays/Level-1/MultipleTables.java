package com.studyopedia.Arrays.Level1;
import java.util.*;
public class MultipleTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to generate multiplication tables for 6 to 9: ");
        int number = sc.nextInt();

        int[] results = new int[4];

        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            results[i - 6] = result;
            System.out.println(number + " * " + i + " = " + result);
        }

	}

}
