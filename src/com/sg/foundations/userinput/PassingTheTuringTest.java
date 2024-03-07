package com.sg.foundations.userinput;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {

        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String name, color, food;
        double number;

        Scanner inputReader = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = inputReader.nextLine();
        System.out.println("hello " + name + ", my name is Bruce");

        System.out.println("What is your favorite colour? ");
        color = inputReader.nextLine();
        System.out.println(color + " is a great colour!");

        System.out.println("What is your favorite food? ");
        food = inputReader.nextLine();
        System.out.println(food + " tastes great!");

        System.out.println("Give me your favourite number: ");
        number = Double.parseDouble(inputReader.nextLine());
        System.out.println(number + " is a great number!");

        System.out.println("goodbye!");
    }
}
