package day4;
import java.util.*;
public class Q10 {
        static String[] options = {"rock", "paper", "scissors"};
    static int userWins = 0, compWins = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Game " + i + " - Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            System.out.printf("You: %s, Computer: %s → %s wins\n", user, comp, winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        sc.close();
     }

        showStats(n);
    }

    static String getComputerChoice() {
        int rand = (int) (Math.random() * 3);
        return options[rand];
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "User";
        else return "Computer";
    }

    static void showStats(int totalGames) {
        System.out.println("\n--- Game Stats ---");
        System.out.println("User Wins     : " + userWins);
        System.out.println("Computer Wins : " + compWins);
        int draws = totalGames - userWins - compWins;
        System.out.println("Draws         : " + draws);
        System.out.printf("User Win %%     : %.2f%%\n", (userWins * 100.0) / totalGames);
        System.out.printf("Computer Win %% : %.2f%%\n", (compWins * 100.0) / totalGames);
    }
}