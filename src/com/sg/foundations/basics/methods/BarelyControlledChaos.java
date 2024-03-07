package com.sg.foundations.basics.methods;

import java.util.Random;

public class BarelyControlledChaos {

    public static String randomColour(){
        Random randomizer = new Random();
        int myRandomInt = randomizer.nextInt(5);
        String myReturnString;
        switch (myRandomInt) {
            case 0:
                myReturnString = "Blue";
                break;
            case 1:
                myReturnString = "Yellow";
                break;
            case 2:
                myReturnString = "Green";
                break;
            case 3:
                myReturnString = "Purple";
                break;
            case 4:
                myReturnString = "Orange";
                break;
            default:
                myReturnString = "Error!";
        }
        return myReturnString;
    }

    public static String randomAnimal(){
        Random randomizer = new Random();
        int myRandomInt = randomizer.nextInt(5);
        String myReturnString;
        switch (myRandomInt) {
            case 0:
                myReturnString = "Zebra";
                break;
            case 1:
                myReturnString = "Dog";
                break;
            case 2:
                myReturnString = "Cat";
                break;
            case 3:
                myReturnString = "Bear";
                break;
            case 4:
                myReturnString = "Elephant";
                break;
            default:
                myReturnString = "Error!";
        }
        return myReturnString;
    }

    public static int randomInteger(int min, int max){
        Random randomizer = new Random();
        return randomizer.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {

        String color = randomColour(); // call color method here
        String animal = randomAnimal(); // call animal method again here
        String colorAgain = randomColour(); // call color method again here
        int weight = randomInteger(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = randomInteger(10, 20); // call number method,
        // with a range between 10 - 20
        int number = randomInteger(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = randomInteger(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }
}