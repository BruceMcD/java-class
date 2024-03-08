package com.sg.foundations.basics.rockpaperscissors;


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static int getUserInt(Scanner scanner, String question){
        System.out.println(question);
        return Integer.parseInt(scanner.nextLine());
    }

    public static int rollNumber(){
        // Random object should actually be in the lucky loop and passed as a parameter
        Random randomizer = new Random();
        return randomizer.nextInt(3) + 1;
    }

    public static String round(int userRoll, int cpuRoll){
        if (userRoll == cpuRoll){
            return "draw";
        }else if((userRoll == 1 && cpuRoll == 3) || (userRoll == 2 && cpuRoll == 1) || (userRoll == 3 && cpuRoll == 2)){
            return "win";
        }else {
            return "lose";
        }
    }

    public static String numberToAction(int playerNumber){
        return switch (playerNumber) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> ("Invalid choice");
        };
    }

    public static int askForNumber(Scanner scanner, int maxNumber){
        int numberOfRounds;
        while (true) {
            try {
                // Prompt the user for input
                numberOfRounds = getUserInt(scanner, "Enter an integer between 1 and " + maxNumber + ": ");

                // Check if the input is within the valid range
                if (numberOfRounds >= 1 && numberOfRounds <= maxNumber) {
                    break; // Exit the loop if input is valid
                } else {
                    System.out.println("Invalid input. Please enter an integer between 1 and " + maxNumber + ".");
                }
            } catch (Exception e) {
                // Handle input mismatch exception
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return numberOfRounds;
    }


    public static void mainGameLoop(Scanner scanner){
        int numberOfRounds, wins = 0, draws = 0, losses = 0;

        // This needs to be in a try catch

        System.out.println("How many Rounds do you want to play this game?: ");
        numberOfRounds = askForNumber(scanner, 10);

        for(int i = 0; i < numberOfRounds; i++){
            int cpuRoll = rollNumber();
            int userRoll = getUserInt(scanner, "Rock: 1, Paper: 2, Scissors: 3 ? ");
            String roundOutcome = round(userRoll, cpuRoll);
            System.out.println("You played " + numberToAction(userRoll) + " and I played " + numberToAction(cpuRoll) + ", you " + roundOutcome + " this round.");
            if(roundOutcome.equals("win")){
                wins++;
            } else if (roundOutcome.equals("draw")) {
                draws++;
            }else {
                losses++;
            }
        }

        System.out.println("Number of Wins: " + wins);
        System.out.println("Number of losses: " + losses);
        System.out.println("Number of draws: " + draws);

        if(wins > losses && wins > draws){
            System.out.println("Congratulations, you win!");
        } else if (losses > wins && losses > draws) {
            System.out.println("Unlucky, you lose!");
        }else {
            System.out.println("Looks like the end result is a draw");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to rock Paper scissors. How many games do you want to play?: ");
        int numberOfGames = askForNumber(scanner, 4);

        for(int i = 0; i < numberOfGames; i++){
            mainGameLoop(scanner);
        }
    }
}
