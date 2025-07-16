package day5;

import java.util.Scanner;

public class Q12 {

    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1}; // end+1 to match substring logic
    }

    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int[] indices = findTrimIndices(text);
        String customTrim = customSubstring(text, indices[0], indices[1]);
        String builtInTrim = text.trim();

        System.out.println("Custom: [" + customTrim + "]");
        System.out.println("Built-in: [" + builtInTrim + "]");
        System.out.println("Same result: " + compare(customTrim, builtInTrim));
        input.close();
    }
}



