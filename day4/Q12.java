package day4;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        // your code here
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] bounds = getTrimIndexes(text);
        String trimmedManual = substringUsingCharAt(text, bounds[0], bounds[1]);
        String trimmedBuiltIn = text.trim();

        System.out.println("Manual Trim: \"" + trimmedManual + "\"");
        System.out.println("Built-in Trim: \"" + trimmedBuiltIn + "\"");
     sc.close();
    }

    static int[] getTrimIndexes(String str) {
        int start = 0, end = str.length();
        while (start < end && str.charAt(start) == ' ') start++;
        while (end > start && str.charAt(end - 1) == ' ') end--;
        return new int[]{start, end};
    }

    static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) result += str.charAt(i);
        return result;
    }
}
