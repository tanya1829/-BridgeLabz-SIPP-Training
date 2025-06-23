import java.util.Scanner;

public class OddEvenSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("Enter a natural number");
            return;
        }

        int[] odd = new int[num / 2 + 1];
        int[] even = new int[num / 2 + 1];
        int o = 0, e = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < e; i++) System.out.print(even[i] + " ");
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < o; i++) System.out.print(odd[i] + " ");
    }
}