package day5;

import java.util.Scanner;

public class Q2
 {
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        int start = input.nextInt();
        int end = input.nextInt();
        String custom = customSubstring(text, start, end);
        String builtIn = text.substring(start, end);
        boolean isSame = compareUsingCharAt(custom, builtIn);
        System.out.println("Custom substring: " + custom);
        System.out.println("Built-in substring: " + builtIn);
        System.out.println("Match: " + isSame);
        input.close();
    }
}
