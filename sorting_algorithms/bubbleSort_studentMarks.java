package sorting_algorithms;

import java.util.Scanner;

public class bubbleSort_studentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {  // Outer loop for passes
            for (int j = 0; j < n - 1 - i; j++) {  // Inner loop for comparison
                if (marks[j] > marks[j + 1]) {
                    // Swap
                    int temp = marks[j];
                     marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        // Display sorted marks
        System.out.println("Sorted marks in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}

