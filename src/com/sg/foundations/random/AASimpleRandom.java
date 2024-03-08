package com.sg.foundations.random;

import java.util.Random;

public class AASimpleRandom {

    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random integer between 0 and 9
        int randomNumber = random.nextInt(10);

        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();

        // Print the random numbers
        System.out.println("Random integer: " + randomNumber);
        System.out.println("Random double: " + randomDouble);
    }


}
