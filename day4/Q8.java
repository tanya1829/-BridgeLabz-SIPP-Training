package day4;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int manualLen = findLength(input);
        int builtInLen = input.length();

        System.out.println("Manual length: " + manualLen);
        System.out.println("Built-in length: " + builtInLen);
     sc.close();
    }

    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

}
