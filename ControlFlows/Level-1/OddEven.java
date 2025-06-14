package com.studyopediaControlFlows.level1;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
            }
        } else {
            System.out.println("Not a natural number");
        }

	}

}
