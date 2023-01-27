package replit;

import java.util.Scanner;

public class Cevap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        int player1Points = 0;
        int player2Points = 0;

        System.out.println("Player 1, enter a word to start the game: ");
        word = input.nextLine();

        boolean gameRunning = true;
        while (gameRunning) {
            System.out.println("Player 2, is the word '" + word + "' valid? (y/n)");
            String player2Answer = input.nextLine();

            if (player2Answer.equalsIgnoreCase("y")) {
                player1Points += word.length();
                System.out.println("Player 1 now has " + player1Points + " points.");
            } else {
                System.out.println("Invalid word, Player 1 won the game.");
                gameRunning = false;
                break;
            }

            System.out.println("Do you want to continue the game? (y/n)");
            String continueAnswer = input.nextLine();
            if (continueAnswer.equalsIgnoreCase("y")) {
                System.out.println("Player 2, enter a letter to add: ");
                String letter = input.nextLine();
                System.out.println("Where do you want to add the letter? (beginning/end) ");
                String position = input.nextLine();
                if (position.equalsIgnoreCase("beginning")) {
                    word = letter + word;
                } else {
                    word = word + letter;
                }
            } else {
                System.out.println("Game Finished.");
                System.out.println("Player 1: " + player1Points + " points.");
                System.out.println("Player 2: " + player2Points + " points.");
                if (player1Points > player2Points) {
                    System.out.println("Player 1 won the game!");
                } else if (player2Points > player1Points) {
                    System.out.println("Player 2 won the game!");
                } else {
                    System.out.println("It's a tie!");
                }
                gameRunning = false;
            }
        }
    }
}
