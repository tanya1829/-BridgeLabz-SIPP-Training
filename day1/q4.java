 import java.util.Scanner;
 public class q4 {
   

    // Static method to calculate volume
    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculating volume
        double volume = calculateVolume(radius, height);

        // Displaying result
        System.out.printf("The volume of the cylinder is: %.2f\n", volume);
        
        scanner.close();
    }
}

