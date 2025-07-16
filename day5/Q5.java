package day5;

import java.util.Scanner;

public class Q5
 {
    public static void generateException(String text) {
        System.out.println("Character at invalid index:");
        System.out.println(text.charAt(100)); // Will throw exception
    }

    public static void handleException(String text) {
        try {
            System.out.println("Handling invalid index:");
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Caught General Exception");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();

        // generateException(text); // Uncomment to test crash
        handleException(text);

        input.close();
    }
}
