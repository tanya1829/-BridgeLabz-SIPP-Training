package day2;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;

        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", " + op4);
        input.close();
    }
}
