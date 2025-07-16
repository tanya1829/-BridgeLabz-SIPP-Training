package day5;

import java.util.Scanner;

public class Q17 {

    public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int wordIndex = 0;
        String current = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[wordIndex++] = current;
                current = "";
            } else {
                current += ch;
            }
        }
        words[wordIndex] = current;
        return words;
    }

    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] findMinMax(String[] words) {
        int minLen = customLength(words[0]);
        int maxLen = customLength(words[0]);
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            int len = customLength(word);
            if (len < minLen) {
                minLen = len;
                shortest = word;
            }
            if (len > maxLen) {
                maxLen = len;
                longest = word;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] words = splitWords(text);
        String[] result = findMinMax(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        input.close();
    }
}
