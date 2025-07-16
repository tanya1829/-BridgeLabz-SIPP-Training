package day4;

import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        int[] ages = generateRandomAges(10);
        String[][] result = checkVotingEligibility(ages);

        System.out.println("Age\tCan Vote");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90); // 0 to 89
        }
        return ages;
    }

    static String[][] checkVotingEligibility(int[] ages) {
        String[][] data = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            data[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return data;
    }
}
