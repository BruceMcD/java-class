package com.sg.foundations.basics.interestcalculator;

import java.util.Scanner;
public class InterestCalculator {

    // Refactor ideas:
    // Add exception handling to the user inputs.
    // Add round and trailing 0's format function.

    // Additional Challenges:
    // Change the program so that interest is compounded monthly.
    // Change the program so that the user can choose from quarterly, monthly, or daily interest compound periods.

    // Interest calculation functions
    // the yearly interest function compounds the interest of the quarterly interest function 4 times and returns this to user.
    public static double calculateQuarterlyInterest(double quarterlyInterestRate, double currentBalance){
        return currentBalance * (1 + (quarterlyInterestRate / 100));
    }
    public static double calculateYearlyInterest(double yearlyInterestRate, double initialBalance){

        double returnYearlyInterest = initialBalance;
        for(int i = 0; i < 4; i++){
            returnYearlyInterest = calculateQuarterlyInterest((yearlyInterestRate/4), returnYearlyInterest);
        }
        return returnYearlyInterest;
    }

    // Get user input functions, I've decided to make 2 separate functions for ints and doubles, this is because
    // putting it into 1 function will aff alternative complexities and this solution is more readable.
    public static double getUserDouble(Scanner scanner, String question){
        System.out.println(question);
        return Double.parseDouble(scanner.nextLine());
    }
    public static int getUserInt(Scanner scanner, String question){
        System.out.println(question);
        return Integer.parseInt(scanner.nextLine());
    }

    public static void main(String[] args) {
        // Create empty variables
        double annualInterestRate, initialAmountOfPrincipal;
        int numberOfYearsInterest;

        // Get user input and assign to my empty variables.
        Scanner scanner = new Scanner(System.in);
        initialAmountOfPrincipal =  getUserDouble(scanner,"How much do you want to invest?  " );
        numberOfYearsInterest = getUserInt(scanner,"How many years are investing?  ");
        annualInterestRate = getUserDouble(scanner, "What is the annual interest rate % growth? ");

        // Printing out:
        // Padding
        System.out.println();
        System.out.println("Calculating...");

        // Main print loop.
        for (int i = 0; i < numberOfYearsInterest; i++){
            double endPrincipal = calculateYearlyInterest(annualInterestRate, initialAmountOfPrincipal);
            System.out.println("Year " + (i + 1)); // Print the year
            System.out.println("Began with $" + String.format("%.2f", initialAmountOfPrincipal)); //Print beginning principal, format to round and add trailing 0's
            System.out.println("Earned $" + String.format("%.2f", (endPrincipal - initialAmountOfPrincipal))); // Print out amount earned
            System.out.println("Ended with $" + String.format("%.2f", endPrincipal)); // Print out amount total
            initialAmountOfPrincipal = endPrincipal; // Reset the initial amount for the following year.
            System.out.println(); // Pad the output
        }
    }
}
