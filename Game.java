import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        int player, computer;
        int playerWins = 0;
        int computerWins = 0;
        int rounds = 0;

        Scanner scan = new Scanner(System.in);

        while (playerWins < 2 && computerWins < 2) {
            System.out.println("Welcome to the best game");
            System.out.println("");
            System.out.println("Choice");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("Enter your choice:");
            System.out.println("");

            // Player logic
            player = scan.nextInt();

            switch (player) {
                case 1:
                    System.out.println("Player chose ROCK");
                    break;
                case 2:
                    System.out.println("Player chose PAPER");
                    break;
                case 3:
                    System.out.println("Player chose SCISSORS");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            // Computer logic
            computer = (int) (Math.random() * 3 + 1);

            switch (computer) {
                case 1:
                    System.out.println("Computer chose ROCK");
                    break;
                case 2:
                    System.out.println("Computer chose PAPER");
                    break;
                case 3:
                    System.out.println("Computer chose SCISSORS");
                    break;
            }

            // Logic to determine the winner
            System.out.println("");

            if (player == computer) {
                System.out.println("Draw");
            } else {
                if ((player == 1 && computer == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)) {
                    System.out.println("Player wins!");
                    playerWins++;
                } else {
                    System.out.println("Computer wins!");
                    computerWins++;
                }
            }

            rounds++;
            System.out.println("Round: " + rounds);
            System.out.println("Player: " + playerWins + " wins");
            System.out.println("Computer: " + computerWins + " wins");
            System.out.println("---------------");
        }

        if (playerWins == 2) {
            System.out.println("Player wins the best of 3!");
        } else {
            System.out.println("Computer wins the best of 3!");
        }

        scan.close();
    }
}
