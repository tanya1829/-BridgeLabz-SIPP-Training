package day3;

import java.util.Scanner;

public class q19 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int i = 1;
        if (num > 0) {
            while (i <= num) {
                if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
                i++;
            }
        }
        input.close();
    }
}
