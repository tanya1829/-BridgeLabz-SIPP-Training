package day5;

import java.util.Scanner;

public class Q14 {

    public static String getType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getType(ch);
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Char", "Type");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[][] result = analyzeString(text);
        displayTable(result);
        input.close();
    }
}
