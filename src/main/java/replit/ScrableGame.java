package replit;

import java.util.Scanner;

public class ScrableGame {/*Write a Scrabble Game for two person
 Rules
OK== 1- At the beginning Ask to first Player enter a word for starting game
OK 2- Then change the player ask to new player if given word is valid or not
OK		i) If new player accepts the given word add number of letters in the word as points to player who wrote the word And go to step 3
OK     ii) If new player  does not accept the word as valid then print "Invalid word, player X(Current player) won the game" and finish the game

OK  3- Ask to users if user want to continue game or not
OK     i) If player want to continue,
OK      ask to user a letter to add to word
OK      and ask to user side to add (beginning or end)
OK       then add letter to word and run step 2

OK    ii) If player does not want to continue
  then print "Game Finished" and print points  and winner*/
    static int point1 = 0;
    static int point2 = 0;
    static String word1="";
    static String word2="";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1, Please enter a word to start the game.");
        String word1 = scan.nextLine();

        boolean gameRunning = true;
        while (true) {
            System.out.println("Player 2 is the word " + word1 + " is valid? (y/n)");
            String answerPlayer2 = scan.next();
            if (answerPlayer2.equalsIgnoreCase("y")) {
                point1 += word1.length();
                System.out.println("player 1 has a  " + point1 + " point");
            } else {
                System.out.println("Word is invalid. Player 2 won the game. ");
                gameRunning = false;
                break;
            }
            System.out.println("Do you want to continue the game (y/n)");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Player 2 Please enter a word");
                String player2Word = scan.nextLine();
                scan.nextLine();
                System.out.println("Where do you want to add word?(beginning/end)");
                String word2 = scan.nextLine();

                if (word2.equalsIgnoreCase("beginning")) {
                   point2= player2Word.length()+word1.length() ;
                } else {
                    point2= word1.length()+ player2Word.length();
                }

            } else {
                System.out.println("Game finished");
                System.out.println("Player 1 has " + point1 + " points");
                System.out.println("Player 2 has " + point2 + " points");
                if (point1 > point2) {
                    System.out.println("Player 1 won the game");
                } else if (point2 < point1) {
                    System.out.println("Player 2 won the game");
                } else {
                    System.out.println("it is a tie!");

                }
                gameRunning = false;

            }
        }

    }
}
