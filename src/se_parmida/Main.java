package se_parmida;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("  Welcome to the game of Dice!");
        System.out.println("----------------------------------");
        System.out.println("We begin the game by choosing name for the players!");

        System.out.println("Choose name for player one and press enter");
        Player playerOne = new Player(scanner.nextLine());

        System.out.println("Choose name for player two and press enter");
        Player playerTwo = new Player (scanner.nextLine());
        System.out.println("Now we begin!");
        System.out.println();


        Dice dice = new Dice();

        for (int i =0; i < 2; i++){

            System.out.println("Press enter to roll the dice");
            scanner.nextLine();

            int sum1 = dice.rollDice(); //spelare 1
            System.out.println(playerOne.getName() + " got: " + sum1);
            playerOne.addScore(sum1);
            System.out.println();

            System.out.println("Press enter to roll the dice");
            scanner.nextLine();

            int sum2 = dice.rollDice(); //spelare 2
            System.out.println(playerTwo.getName() + " got: " + sum2);
            playerTwo.addScore(sum2);
            System.out.println();

        }

        System.out.println(playerOne.getName() + "`s total points: " + playerOne.getScore());
        System.out.println(playerTwo.getName() + "`s total point: " + playerTwo.getScore());

        System.out.println();

        System.out.println("--------------");
        if (playerOne.getScore() > playerTwo.getScore()){
            System.out.println(playerOne.getName() + " wins!");
        }
        else if (playerTwo.getScore() > playerOne.getScore()){
            System.out.println(playerTwo.getName() + " wins!!!");
        }
        else {
            System.out.println("It was a draw!");
        }
    }
}
