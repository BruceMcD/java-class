package com.sg.foundations.basics.luckysevens;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
/*
In this lab, you will write a program that plays Lucky Sevens. The rules of the game are:

Each round, the program rolls a virtual pair of dice for the user.
If the sum of the two dice is equal to 7, the player wins $4; otherwise, the player loses $1.
Your job is to write a program that plays this game, which will also demonstrate the futility of playing Lucky Sevens.

This exercise is provided to give you practice applying the skills you have learned in this course, but you will not submit it to your instructor nor will it be graded, unless otherwise directed by your instructor.

You should complete this exercise before continuing on with the course.
If you have problems completing this exercise, review the course content up to this point and try again.
Contact an instructor or TA if you have questions about this exercise or cannot resolve problems on your own.
Remember to sync your code with your classwork repository after you have completed the exercise.

Your program must include the following features:

This program will be a Java Console Application called LuckySevens.
The program first asks the user how many dollars they have to bet.
The program then rolls the dice repeatedly until all the money is gone.
Hint: Use a loop construct to keep playing until the money is gone.
The program keeps track of how many rolls were taken before the money ran out.
The program keeps track of the maximum amount of money held by the player.
The program keeps track of how many rolls were taken at the point when the user held the most money.
Hint: For steps 4, 5, and 6, declare some variables.

How many dollars do you have? 100
You are broke after 543 rolls.
You should have quit after 47 rolls when you had $113.

 */


    // Refactoring - Needs better commenting
    public static int rollDie(){
        // Random object should actually be in the lucky loop and passed as a parameter
        Random randomizer = new Random();
        return randomizer.nextInt(6) + 1;
    }
    public static int[] luckyLoop(int userDollars){
        int dieOne;
        int dieTwo;

        // index 0 = number of rolls, index 1 = highest cash amount, index 2 = roll number highest amount occurred

        int highestCashAmount = userDollars;
        int highestCashRollNumber = 1;
        int numberOfTotalRolls = 1;

        for (int i = 1; userDollars > 0; i++){
            dieOne = rollDie();
            dieTwo = rollDie();
            if (dieOne + dieTwo == 7){
                userDollars += 4;
                if (userDollars > highestCashAmount){
                    highestCashAmount = userDollars;
                    highestCashRollNumber = i;
                }
            }else {
                userDollars -= 1;
            }
            numberOfTotalRolls++;
        }
        return new int[]{numberOfTotalRolls, highestCashAmount, highestCashRollNumber};

    }
    public static int getUserInt(Scanner scanner, String question){
        System.out.println(question);
        return Integer.parseInt(scanner.nextLine());
    }

    public static void main(String[] args) {
        // initialise Scanner and get user input.
        Scanner scanner = new Scanner(System.in);
        int userDollars;
        userDollars = getUserInt(scanner, "How many dollars do you have? ");

        // get list of otu
        int[] myOutputs = luckyLoop(userDollars);

        System.out.println("You are broke after " + myOutputs[0] + " rolls.");
        System.out.println("You should have quit after " + myOutputs[2] + " rolls when you had $" + myOutputs[1] + ".");
    }
}
