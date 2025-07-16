package day5;

import java.util.Scanner;

public class Q3 {
    public static void generateException(String[] names) {
        System.out.println("Accessing index 100 (invalid):");
        System.out.println(names[100]); // will throw exception
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Handling exception:");
            System.out.println(names[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }

        // generateException(names); // Uncomment to test unhandled crash
        handleException(names);
        input.close();
    }
}
