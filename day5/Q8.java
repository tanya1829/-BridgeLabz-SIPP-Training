package day5;

import java.util.Scanner;

public class Q8 {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // expected when index goes out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        int customLen = customLength(text);
        int builtInLen = text.length();
        System.out.println("Custom length: " + customLen);
        System.out.println("Built-in length: " + builtInLen);
        input.close();
    }
}
