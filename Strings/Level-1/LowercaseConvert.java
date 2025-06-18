package com.studyopedia.Strings.Level1;
import java.util.Scanner;
public class LowercaseConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manual = toLowerCaseManual(input);
        String builtin = input.toLowerCase();

        System.out.println("Manual Lowercase: " + manual);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Are both same? " + manual.equals(builtin));
    }

    public static String toLowerCaseManual(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    

	}

}
