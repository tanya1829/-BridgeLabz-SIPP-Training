package day4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Uncomment to see unhandled exception
        // generateException(input);

        handleStringException(input);
     sc.close();
    }

    static void generateException(String str) {
        System.out.println(str.charAt(100)); // Error if length < 100
    }

    static void handleStringException(String str) {
        try {
            System.out.println(str.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
    }
}
