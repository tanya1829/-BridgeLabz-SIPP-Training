// Creating Class with name TriangleChecker indicating the purpose is to check if the internal angles add to 180
import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get 3 input values for angles
        System.out.println("Enter 3 angles of a triangle:");
        int angleX = input.nextInt();
        int angleY = input.nextInt();
        int angleZ = input.nextInt();

        // Find the sum of all angles
        int sumOfAngles = angleX + angleY + angleZ;

        // Display sum and check validity
        System.out.println("The given angles " + angleX + ", " + angleY + ", " + angleZ + " add to " + sumOfAngles);

        // Conditional check
        if (sumOfAngles == 180) {
            System.out.println("The given angles are internal angles of a Triangle.");
        } else {
            System.out.println("The given angles are not internal angles of a Triangle.");
        }

        // Close Scanner
        input.close();
    }
}