package day3;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();

        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus is: " + bonus);
        } else {
            System.out.println("No bonus");
        }
        input.close();
    }
}
