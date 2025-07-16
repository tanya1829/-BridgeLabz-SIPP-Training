package day4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // your code here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] manualWords = splitWords(input);
        String[] builtInWords = input.split(" ");

        System.out.println("Manual words:");
        for (String word : manualWords) System.out.println(word);

        System.out.println("Built-in words:");
        for (String word : builtInWords) System.out.println(word);

        System.out.println("Are both word arrays same? " + compareArrays(manualWords, builtInWords));
     sc.close();
    }

    static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        String word = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += ch;
            }
        }
        words[index] = word;
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }
}

 