package day3;

import java.util.Scanner;

public class q7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        input.close();
    }
}
