// Class to compute the sum of all digits of a number
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get input value for number
        System.out.print("Enter a number: ");
        int originalNumber = input.nextInt();

        // Declare and initialize variables
        int number = originalNumber;
        int sum = 0;

        // Loop through digits
        while (number != 0) {
            int digit = number % 10; // extract last digit
            sum += digit;            // add digit to sum
            number = number / 10;    // remove last digit
        }

        // Print result
        System.out.println("The sum of digits of number " + originalNumber + " = " + sum);

        // Close Scanner
        input.close();
    }
}