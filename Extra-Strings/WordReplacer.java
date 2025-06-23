package com.studyopedia.StringExtras;
public class WordReplacer {
    public static void main(String[] args) {
        String sentence = "Java is powerful. Java is versatile.";
        String modified = replaceWord(sentence, "Java", "Python");
        System.out.println("Modified Sentence: " + modified);
    }

    static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll(oldWord, newWord);
    }
}
