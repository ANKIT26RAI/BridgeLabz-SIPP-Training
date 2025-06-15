package com.studyopediaControlFlows.level2;
import java.util.*;
public class FriendsAgeHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int age1 = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int height1 = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int age2 = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height2 = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int age3 = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height3 = sc.nextInt();

        int minAge = Math.min(age1, Math.min(age2, age3));
        if (minAge == age1) System.out.println("Youngest: Amar");
        else if (minAge == age2) System.out.println("Youngest: Akbar");
        else System.out.println("Youngest: Anthony");

        
        int maxHeight = Math.max(height1, Math.max(height2, height3));
        if (maxHeight == height1) System.out.println("Tallest: Amar");
        else if (maxHeight == height2) System.out.println("Tallest: Akbar");
        else System.out.println("Tallest: Anthony");
    

	}

}
