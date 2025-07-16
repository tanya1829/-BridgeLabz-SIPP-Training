package day3;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();

        System.out.println("Is the first number the smallest? " + (a < b && a < c));
        input.close();
    }
}
