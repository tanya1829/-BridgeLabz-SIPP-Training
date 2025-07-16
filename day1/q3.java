import java.util.Scanner;
public class q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take radius input from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area using the formula: π * radius^2
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("Area of the circle is: " + area);
        
        scanner.close();
    }
}


