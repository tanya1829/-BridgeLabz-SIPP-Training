package day5;

import java.util.Scanner;

public class Q10 {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        return switch (user + "-" + computer) {
            case "rock-scissors", "paper-rock", "scissors-paper" -> "User";
            default -> "Computer";
        };
    }

    public static String[][] getStats(String[] winners, int totalGames) {
        int userWins = 0, computerWins = 0;
        for (String w : winners) {
            if (w.equals("User")) userWins++;
            else if (w.equals("Computer")) computerWins++;
        }
        double userPct = (userWins * 100.0) / totalGames;
        double compPct = (computerWins * 100.0) / totalGames;

        return new String[][]{
            {"User Wins", String.valueOf(userWins), String.format("%.2f", userPct) + "%"},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f", compPct) + "%"},
        };
    }

    public static void displayResults(String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-15s %-10s %-10s%n", "Player", "Wins", "Win%");
        for (String[] row : stats) {
            System.out.printf("%-15s %-10s %-10s%n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = input.nextInt();

        String[] winners = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String user = input.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            winners[i] = winner;
            System.out.println("Computer chose: " + comp + " → " + winner + " wins");
        }

        String[][] stats = getStats(winners, n);
        displayResults(stats);
        input.close();
    }
}
