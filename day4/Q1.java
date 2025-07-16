
package day4;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        

Scanner sc = new Scanner(System.in);
System.out.print("Enter side 1: ");
double s1 = sc.nextDouble();
System.out.print("Enter side 2: ");
double s2 = sc.nextDouble();
System.out.print("Enter side 3: ");
double s3 = sc.nextDouble();

double perimeter = s1 + s2 + s3;
double rounds = 5000 / perimeter;
System.out.printf("Rounds needed: %.2f%n", rounds);
sc.close();

        // your code here
    }
}
