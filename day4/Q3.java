package day4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // your code here
    
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];

        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }
        handleArrayException(names);
    
    sc.close();
    }
    static void generateException(String[] arr) {
        System.out.println(arr[5]);
    }

    static void handleArrayException(String[] arr) {
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        } 
    } 

}
