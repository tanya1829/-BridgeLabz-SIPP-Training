package day5;

import java.util.Scanner;
import java.util.Arrays;

public class Q9 {

    public static String[] customSplit(String text) {
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
        words[wordIndex] = current; // add last word
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Custom: " + Arrays.toString(custom));
        System.out.println("Built-in: " + Arrays.toString(builtIn));
        System.out.println("Same: " + compareArrays(custom, builtIn));

        input.close();
    }
}

