package day3;

import java.util.Scanner;

public class Q33 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (sum > num)
            System.out.println(num + " is an Abundant Number");
        else
            System.out.println(num + " is Not an Abundant Number");
        sc.close();
    }
}
