package com.studyopedia.Strings.Level2;
import java.util.*;
public class WordLength2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = ManualSplit.manualSplit(text);
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(StringLength.getLength(words[i]));
        }

        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }

	}

}
