package com.sg.foundations.oop.simplecalculator;

/*
Design a class (no main method) called SimpleCalculator that performs basic math operations (addition, subtraction, multiplication, division) on two operands.
Create another class called App that presents a simple console calculator UI to the user. This second class should handle all user input and console output and must use the first class to perform all of the math operations.
The UI should give the user a choice of operations. One of the choices should be to exit the program.
After the user selects an operation, the UI should ask the user for two operands and then display the result of the calculation.
The UI should then display the menu of choices again.
When the user chooses to exit the program, the UI should print a thank you message.
 */
public class SimpleCalculator {
    public static double addition(double a, double b){
        return a + b;
    }
    public static double subtraction(double a, double b){
        return a - b;
    }
    public static double multiplication(double a, double b){
        return a * b;
    }
    public static double division(double a, double b){
        return a /b;
    }

}
