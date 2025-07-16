package day3;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), count = 0;
        if (number == 0) count = 1;
        else {
            while (number != 0) {
                number /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}