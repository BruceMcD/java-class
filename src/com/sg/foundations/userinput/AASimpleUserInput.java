package com.sg.foundations.userinput;

import java.util.Scanner;

public class AASimpleUserInput {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read the user input as a string
        String name = scanner.nextLine();

        // Print a greeting message with the user's name
        System.out.println("Hello, " + name + "!");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
