package com.sg.foundations.oop.simplecalculator;

import java.util.Scanner;


/*
Design a class (no main method) called SimpleCalculator that performs basic math operations (addition, subtraction, multiplication, division) on two operands.
Create another class called App that presents a simple console calculator UI to the user. This second class should handle all user input and console output and must use the first class to perform all of the math operations.
The UI should give the user a choice of operations. One of the choices should be to exit the program.
After the user selects an operation, the UI should ask the user for two operands and then display the result of the calculation.
The UI should then display the menu of choices again.
When the user chooses to exit the program, the UI should print a thank you message.
 */
public class App {
    public static void listOperations(){
        System.out.println("""
                Operation Numbers:
                1 - Addition
                2 - Subtraction
                3 - Multiplication
                4 - Division
                """);
    }
    // function used to check if the double in getUserInput to get operation number is actually an int.
    public static boolean isInteger(double value) {
        return Math.floor(value) == value || Math.ceil(value) == value;
    }
    public static double[] getUserInputTwo(Scanner scanner){
        double[] numberArray = new double[3];
        boolean validInput;
        do {
            try {
                // Prompt the user for input, and put this in the array, if user puts in none double, they'll be asked for inputs again
                System.out.print("Enter first number: ");
                numberArray[0] = (scanner.nextDouble());
                System.out.print("Enter second number: ");
                numberArray[1] = (scanner.nextDouble());
                listOperations();
                System.out.print("Enter operation number: ");
                numberArray[2] = (scanner.nextDouble());
                validInput = true; // If no exception is thrown, set validInput to true to exit the loop
                if(numberArray[2] < 1 || numberArray[2] > 4 && isInteger(numberArray[2])){ // checks to see if the double is actually an int between 1-4 (inclusive and also isn't a double)
                    System.out.println("Not a valid operation number.");
                    validInput = false; // If the operation number is out of range, or a double, set the valid input to false and loop again.
                }

            }  catch (Exception e) {
                // Catching incorrect type inputs - Does not catch 0 division yet, maybe can fix this in SimpleCalc class
                System.out.println("Error invalid input, please try again!");
                validInput = false; // Set validInput to false to repeat the loop
                scanner.nextLine(); // reset the scanner
            }
        } while (!validInput); // if all inputs are valid, break loop
        return numberArray; // returns array of valid doubles
    }
    public static void main(String[] args) {
        // initialise variables
        Scanner scanner = new Scanner(System.in);
        String userInput;
        // runs the main program, if the user wants to stop after it's run then it'll ask them to exit.
        do {
            mainProgram(scanner);
            System.out.println("Type exit to stop program, enter to go again:");
            scanner.nextLine();
            userInput = scanner.nextLine();

        } while (!userInput.equals("exit"));
        System.out.println("Goodbye!");
    }
    public static void mainProgram(Scanner scanner){

        // create the array of user inputs
        double[] userInputArray;
        // get the user inputs and store them in the array
        userInputArray = getUserInputTwo(scanner);

        // Assign the numbers from userInputArray into their own variables for readability purposes, not technically needed
        double numA = userInputArray[0];
        double numB = userInputArray[1];
        int operation = (int) userInputArray[2];

        // Switch statement which takes the operation number and calls the SimpleCalculator functions.
        switch (operation) {
            case 1 -> System.out.println(SimpleCalculator.addition(numA, numB));
            case 2 -> System.out.println(SimpleCalculator.subtraction(numA, numB));
            case 3 -> System.out.println(SimpleCalculator.multiplication(numA, numB));
            default -> System.out.println(SimpleCalculator.division(numA, numB));
        }
    }
}
