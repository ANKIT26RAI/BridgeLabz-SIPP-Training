package com.studyopedia.Strings.Level1;
import java.util.*;
public class CharArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();

        char[] manual = getChars(s);
        char[] builtin = s.toCharArray();

        System.out.println("Arrays equal? " + compareCharArrays(manual, builtin));
    }

    public static char[] getChars(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;

	}

}
