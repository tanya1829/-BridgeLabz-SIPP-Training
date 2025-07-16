package day5;

import java.util.Random;

public class Q16 {

    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(100);
            }
        }
        return marks;
    }

    public static double[][] calculateScores(int[][] marks) {
        double[][] scores = new double[marks.length][3]; // total, avg, pct
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double pct = (total * 100.0) / 300.0;
            scores[i][0] = total;
            scores[i][1] = Math.round(avg * 100.0) / 100.0;
            scores[i][2] = Math.round(pct * 100.0) / 100.0;
        }
        return scores;
    }

    public static String[] assignGrades(double[][] scores) {
        String[] grades = new String[scores.length];
        for (int i = 0; i < scores.length; i++) {
            double pct = scores[i][2];
            if (pct >= 90) grades[i] = "A+";
            else if (pct >= 80) grades[i] = "A";
            else if (pct >= 70) grades[i] = "B";
            else if (pct >= 60) grades[i] = "C";
            else if (pct >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayReport(int[][] marks, double[][] scores, String[] grades) {
        System.out.printf("%-5s %-8s %-8s %-8s %-8s %-8s %-10s %-6s%n",
                "ID", "Physics", "Chem", "Math", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-5d %-8d %-8d %-8d %-8.0f %-8.2f %-10.2f %-6s%n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2],
                    scores[i][0], scores[i][1], scores[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);
        double[][] scores = calculateScores(marks);
        String[] grades = assignGrades(scores);
        displayReport(marks, scores, grades);
    }
}
