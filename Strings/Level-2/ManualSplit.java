package com.studyopedia.Strings.Level2;
import java.util.*;
public class ManualSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] builtIn = text.split(" ");
        String[] manual = manualSplit(text);

        System.out.println("Manual Split: " + Arrays.toString(manual));
        System.out.println("Built-in Split: " + Arrays.toString(builtIn));
        System.out.println("Arrays Equal: " + Arrays.equals(manual, builtIn));
    }

    public static String[] manualSplit(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (ch != ' ') word.append(ch);
                else {
                    if (!word.toString().isEmpty()) {
                        words.add(word.toString());
                        word.setLength(0);
                    }
                }
            } catch (Exception e) {
                if (!word.toString().isEmpty())
                    words.add(word.toString());
                break;
            }
        }
        return words.toArray(new String[0]);
    

	}

}
