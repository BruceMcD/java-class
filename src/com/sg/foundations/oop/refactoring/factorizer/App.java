package com.sg.foundations.oop.refactoring.factorizer;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to factor? "); // Need to add in exception handling here, but otherwise all works
        int myNumber = Integer.parseInt(scanner.nextLine());

        FactorizerRefactor2 factorizer = new FactorizerRefactor2(myNumber);

        // I could turn these into print methods in the factorize class

        factorizer.printFactors();
        factorizer.printIfPerfectNumber();
        factorizer.printIfPrime();

    }
}
