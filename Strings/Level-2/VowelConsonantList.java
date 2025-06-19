package com.studyopedia.Strings.Level2;
import java.util.*;
public class VowelConsonantList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter string:");
	        String str = sc.nextLine();

	        String[][] result = new String[StringLength.getLength(str)][2];

	        for (int i = 0; i < result.length; i++) {
	            char ch = str.charAt(i);
	            result[i][0] = String.valueOf(ch);
	            result[i][1] = VowelConsonantCount.charType(ch);
	        }

	        System.out.println("Char\tType");
	        for (String[] row : result) {
	            System.out.println(row[0] + "\t" + row[1]);
	        }

	}

}
