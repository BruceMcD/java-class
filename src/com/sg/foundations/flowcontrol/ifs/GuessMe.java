package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int myInt = 5;
        int number;
        System.out.println("Give me your favourite number: ");
        number = Integer.parseInt(inputReader.nextLine());

        if (number == myInt){
            System.out.println("Wow, nice guess! That was it!");
        } else if (number < myInt) {
            System.out.println("Ha, nice try - too low! I chose " + myInt);
        } else {
            System.out.println("Too bad, way too high. I chose " + myInt);
        }
    }
}
