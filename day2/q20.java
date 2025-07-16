
package day2;

import java.util.Scanner;

public class q20 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();

        double kg = pounds / 2.2;
        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kg);
        input.close();
}
    }