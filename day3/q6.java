package day3;

import java.util.Scanner;

public class q6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long fact = 1;

        if (n < 0) System.out.println("Invalid Input");
        else {
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println("Factorial is " + fact);
        }
        input.close();
    }
}
