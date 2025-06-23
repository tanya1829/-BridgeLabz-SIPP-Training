package day4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] manualArray = toCharArrayManual(input);
        char[] builtInArray = input.toCharArray();

        boolean isEqual = compareCharArrays(manualArray, builtInArray);

        System.out.print("Manual array: ");
        printArray(manualArray);

        System.out.print("Built-in array: ");
        printArray(builtInArray);

        System.out.println("Are both arrays equal? " + isEqual);
    sc.close();
 }

    static char[] toCharArrayManual(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
