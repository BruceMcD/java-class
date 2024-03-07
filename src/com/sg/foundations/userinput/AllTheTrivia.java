package com.sg.foundations.userinput;

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        String storage, planet, volcano, element;


        System.out.println("What unit is equivalent to 1,024 Gigabytes? ");
        storage = inputReader.nextLine();


        System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
        planet = inputReader.nextLine();


        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet? ");
        volcano = inputReader.nextLine();


        System.out.println("What is the most abundant element in the earth's atmosphere? ");
        element = inputReader.nextLine();

        System.out.println("Wow, 1,024 Gigabytes is a " + volcano);
        System.out.println("I didn't know that the largest ever volcano was discovered on " + storage);
        System.out.println("That's amazing that "+ planet + " is the most abundant element in the atmosphere...");
        System.out.println(element + " is the only planet that rotates clockwise, neat!");


        System.out.println("goodbye!");
    }


}
