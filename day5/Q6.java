package day5;

import java.util.Scanner;
import java.util.Arrays;

public class Q6 {
    public static char[] customToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();

        char[] customArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Custom: " + Arrays.toString(customArray));
        System.out.println("Built-in: " + Arrays.toString(builtInArray));
        System.out.println("Arrays same: " + compareCharArrays(customArray, builtInArray));

        input.close();
    }
}
