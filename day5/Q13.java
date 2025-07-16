package day5;

import java.util.Scanner;

public class Q13 {

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
        } catch (Exception e) {
            // end of string
        }
        return count;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengths = getWordLengths(words);

        System.out.printf("%-15s %-10s%n", "Word", "Length");
        for (String[] row : wordLengths) {
            System.out.printf("%-15s %-10s%n", row[0], row[1]);
        }

        input.close();
    }
}
