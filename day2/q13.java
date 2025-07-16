package day2;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        double total = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and the unit price is INR " + unitPrice);
        input.close();
    }
}
