import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is positive and ");
                System.out.println(num % 2 == 0 ? "even" : "odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println("Number is zero");
            }
        }

        if (numbers[0] > numbers[4])
            System.out.println("First element is greater than last element");
        else if (numbers[0] < numbers[4])
            System.out.println("First element is less than last element");
        else
            System.out.println("First and last elements are equal");
    }
}