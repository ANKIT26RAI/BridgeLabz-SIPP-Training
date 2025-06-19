package com.studyopedia.Strings.Level2;
import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("How many games? ");
        int n = sc.nextInt();
        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Choose rock, paper, or scissors: ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            System.out.println("Computer chose: " + comp);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.printf("User Win %%: %.2f%%\n", userWins * 100.0 / n);
        System.out.printf("Computer Win %%: %.2f%%\n", compWins * 100.0 / n);
    }

    public static String getComputerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        return options[(int) (Math.random() * 3)];
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors") ||
            user.equals("paper") && comp.equals("rock") ||
            user.equals("scissors") && comp.equals("paper")) return "User";
        else return "Computer";

	}

}
