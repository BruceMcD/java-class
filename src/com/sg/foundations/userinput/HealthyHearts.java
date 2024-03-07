package com.sg.foundations.userinput;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int age;

        System.out.println("what is your age?: ");
        age = Integer.parseInt(inputReader.nextLine());

        int maximum = 220 - age;
        int lower = maximum /2;
        double upper = maximum * 0.85;
        System.out.println("your maximum heart rate should be : " + maximum );
        System.out.println("Your target HR Zone is "+ lower + " - " + upper + " beats per minute.");

    }

}

//standup


//what have I done?
//what will I do?

//let people know whether you'll miss
//any feedback that needs to go to the manager
//stress level
//pacing
//I tried to get smart with one of the questions by using hashmaps and it slowed me down, in the future, I'll go through the questions
//as is, and will refactor the code later if I have time.