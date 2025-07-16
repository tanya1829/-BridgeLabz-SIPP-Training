// Program to find area of triangle in cm² and in²
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Area calculation in cm² and conversion to in²
        double areaInCm = 0.5 * base * height;
        double areaInInch = areaInCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaInInch + " and sq cm is " + areaInCm);
    }
}