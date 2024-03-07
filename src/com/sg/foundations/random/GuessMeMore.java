package com.sg.foundations.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomizer = new Random();

        int min = -100;
        int max = 100;
        //Get a random int between a range
        int myRandomNumber = randomizer.nextInt(max - min + 1) + min;

        int userGuess;
        boolean guessedRight = false;

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");

        do {
            System.out.println("Guess a number:   ");
            userGuess = Integer.parseInt(scanner.nextLine());
            if(userGuess == myRandomNumber){
                guessedRight = true;
            }
            else {
                System.out.println("incorrect!");
            }

        } while (!guessedRight);

        System.out.println("that's right, my number was " + myRandomNumber);






    }



}
