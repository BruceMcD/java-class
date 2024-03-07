package com.sg.foundations.basics.factorizer;

import java.util.ArrayList;
import java.util.Scanner;

//Refactor later today.

public class Factorizer {

    public static Boolean checkIfPerfectNumber(int userNumber){

        //Keep adding the numbers and if it goes over then it's not perfect

        ArrayList<Integer> myNumbers = new ArrayList<>();

        int currentTotal = 1;
        int numberToIncrement = 1;
        //System.out.println(currentTotal);
        while(currentTotal < userNumber){
            currentTotal = forAdd(numberToIncrement);
            if(currentTotal < userNumber){
                myNumbers.add(numberToIncrement);
            }
            numberToIncrement++;
        }
        for (int n : myNumbers){
            System.out.println(n);
        }
        return currentTotal == userNumber;
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++)
        {
            if((number% i) == 0)
            {
                // Not Prime
                return false;
            }
        }
        // Prime!
        return true;
    }
    public static int forAdd(int incrementNumber){
        int numberToReturn = 0;
        for(int i = 1; i < incrementNumber; i++ )
        {
            numberToReturn += i;
        }
        return numberToReturn;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int myNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("The factors of " + myNumber + " are:");

        System.out.println(checkIfPerfectNumber(myNumber));
        System.out.println(myNumber);


        if (isPrime(myNumber) == true) {
            System.out.println(myNumber + " is a prime num");
        }else {
            System.out.println("not Prime");
        }

    }


}
