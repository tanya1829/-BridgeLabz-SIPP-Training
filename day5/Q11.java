package day5;

import java.util.Random;

public class Q11 {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(60); // age between 0 and 59
        }
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s%n", "Age", "Can Vote");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] results = canVote(ages);
        displayTable(results);
    }
}
