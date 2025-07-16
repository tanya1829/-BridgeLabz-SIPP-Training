package day2;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes possible is: " + handshakes);
        input.close();
    }
}
