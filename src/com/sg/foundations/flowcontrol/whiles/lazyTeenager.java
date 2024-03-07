package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class lazyTeenager {

    public static void main(String[] args) {

        Random randomizer = new Random();
        int iterations = 0;

        do {
            iterations += 1;

            if (iterations == 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            int randomNumber = randomizer.nextInt(10) + 1; // Generate a random number between 1 and 10
            //System.out.println(randomNumber);
            if (randomNumber > iterations){
                System.out.println("Clean your room!! (x"+iterations+")");
            } else {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }
        } while (true);
    }
}
