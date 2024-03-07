package com.sg.foundations.userinput;

import java.util.Scanner;

public class BiggerBetterAdder {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        double number1, number2, number3;

        System.out.println("Give me your first number: ");
        number1 = Double.parseDouble(inputReader.nextLine());

        System.out.println("Give me your second number: ");
        number2 = Double.parseDouble(inputReader.nextLine());

        System.out.println("Give me your third number: ");
        number3 = Double.parseDouble(inputReader.nextLine());
        System.out.println("total = " + (number1 + number2 + number3));

        System.out.println("goodbye!");
    }

}
