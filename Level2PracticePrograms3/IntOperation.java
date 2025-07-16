// Integer operation precedence demonstration
import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        // Operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Output
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}