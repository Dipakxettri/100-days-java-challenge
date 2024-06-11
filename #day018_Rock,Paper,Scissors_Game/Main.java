
//Simple Rock,Paper,Scissors Game In Java

import java.util.Scanner; // import scanner
import java.util.Random; // import random

public class Main{

    public static void main(String[] args) {

        System.out.println("   Rock, Paper, Scissors game \n"); // Title
        System.out.println(" 1 : Rock \n 2 : Paper \n 3 : Scissors\n"); // simple tutorial

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Random - computer selects a number
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;

        // Computer - selection of random number by computer
        System.out.println("\n\n  Computer is selecting .....");
        System.out.println("  Computer selected a number \n");

        // Real person - selection of number by real person
        System.out.print("  Now your turn: ");
        int playerChoice = scanner.nextInt();

        // Display choices
        System.out.println("Computer chose: " +  computerChoice);
        System.out.println("You chose: " + playerChoice);

        // Determine the result
        if (computerChoice == playerChoice) {
            System.out.println("\n\n  It's a tie!");
        }
        else if (computerChoice == 1 && playerChoice == 3 ||
                   computerChoice == 3 && playerChoice == 2 ||
                   computerChoice == 2 && playerChoice == 1) {
            System.out.println("\n\n  Computer wins!");
        }
        else {
            System.out.println("\n\n  You win!");
        }

        // Close the scanner
        scanner.close();
    }

          }
