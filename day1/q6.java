import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter Width: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);

        scanner.close();
    }
}
