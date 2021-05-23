/*  Created by IntelliJ IDEA.
 *  User: Sanjana Varshney
 *  Date: 23/05/2021
 *  Time: 11:03 AM
 */
import java.util.Random;
import java.util.Scanner;

public class Game {

    public void play() {

        int yourScore = 0;
        int computerScore = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*** Game Started ***");
        System.out.println("0 --> rock\n1 --> paper\n2 --> scissor");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nSelect one number among 0, 1 or 2.");
            int human = scanner.nextInt();
            int computer = random.nextInt(3);
            System.out.println("Computer selected " + computer);

            if ((computer == 0 && human == 1) || (computer == 1 && human == 2) || (computer == 2 && human == 0)) {
                System.out.println("You Won!");
                yourScore++;

            } else if ((computer == 0 && human == 2) || (computer == 1 && human == 0) || (computer == 2 && human == 1)) {
                System.out.println("You Lose!");
                computerScore++;

            } else if ((computer == 0 && human == 0) || (computer == 1 && human == 1) || (computer == 2 && human == 2)) {
                System.out.println("It's a tie, both selected the same.");

            } else {
                System.out.println("You have entered something invalid.");
            }
        }
        System.out.println("\n***  final score is ***\nComputer scored " + computerScore + " and You scored " + yourScore);

        if (yourScore > computerScore) {
            System.out.println("\nCongratulations! You are the winner");

        } else {
            System.out.println("\nYou lose the game");
            System.out.println("Better luck next time!");
        }
    }
}
