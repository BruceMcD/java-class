package com.sg.foundations.basics.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorizer2 {

    //Takes an int, and returns an array containing the factors of the input in.
    public static ArrayList<Integer> getArrayOfFactors(int userNumber){
        // Create an ArrayList to store factors
        ArrayList<Integer> factors = new ArrayList<>();
        // Checks every number up to half the userNumber for a factor and adds this to the ArrayList. There are more efficient algorithms but for now this is fine.
        for(int i = 1; i <= (userNumber/2) + 1; i++){
            if(userNumber % i == 0){
                factors.add(i);
            }
        }
        factors.add(userNumber); //Add the user number for output and prime calculation.
        return factors; //Return the ArrayList of factors
    }

    // Adds up the factors to see if the sum of the factors equal the user number
    public static boolean checkIfPerfectNumber(ArrayList<Integer> factorArray){
        int arrayLength = factorArray.size();
        int addedFactors = 0;
        for(int i = 0; i < arrayLength - 1; i++ ){
            addedFactors = addedFactors + factorArray.get(i);
        }
        return addedFactors == factorArray.get(arrayLength - 1); // The last element of the array is the user number
    }
    
    public static void main(String[] args) {

        // Ask for user input: number - Needs refactored to include exception handling.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to factor? ");
        int myNumber = Integer.parseInt(scanner.nextLine());

        // Create an ArrayList to store the factors of the user integer
        ArrayList<Integer> numberFactors;

        numberFactors = getArrayOfFactors(myNumber);

        // Outputting:
        System.out.println("The factors of " + myNumber + " are:");

        // Print out all the factors AND the number itself
        for (int n : numberFactors){
            System.out.print(n + " ");
        }

        // Spacing println
        System.out.println();

        // Print the number of factors
        System.out.println(myNumber + " has " + numberFactors.size() + " factors.");

        // determine whether perfect number and print answer
        boolean isNumberPerfect = checkIfPerfectNumber(numberFactors);
        if (isNumberPerfect){
            System.out.println(myNumber + " is a perfect number.");
        }else {
            System.out.println(myNumber + " is not a perfect number.");
        }

        // If the factors array == 2, then the only numbers the array contains is 1 and the number itself, meaning it's prime - Print the answer.
        if (numberFactors.size() == 2){
            System.out.println(myNumber + "is a prime number.");
        }else {
            System.out.println(myNumber + " is not a prime number.");
        }
    }
}
