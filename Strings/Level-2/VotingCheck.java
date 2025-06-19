package com.studyopedia.Strings.Level2;
import java.util.*;
public class VotingCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] ages = generateAges(10);
	        String[][] result = checkVotingEligibility(ages);

	        System.out.println("Age\tCan Vote?");
	        for (String[] row : result) {
	            System.out.println(row[0] + "\t" + row[1]);
	        }
	    }

	    public static int[] generateAges(int n) {
	        int[] ages = new int[n];
	        for (int i = 0; i < n; i++) {
	            ages[i] = (int) (Math.random() * 90 + 10);
	        }
	        return ages;
	    }

	    public static String[][] checkVotingEligibility(int[] ages) {
	        String[][] data = new String[ages.length][2];
	        for (int i = 0; i < ages.length; i++) {
	            data[i][0] = String.valueOf(ages[i]);
	            data[i][1] = (ages[i] >= 18 ? "true" : "false");
	        }
	        return data;

	}

}
