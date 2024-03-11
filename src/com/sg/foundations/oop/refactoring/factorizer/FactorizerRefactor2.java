package com.sg.foundations.oop.refactoring.factorizer;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorizerRefactor2 {


    private int myNumber;

    private ArrayList<Integer> factors;
    private Scanner scanner;
    private ArrayList<Integer> numberFactors;



    public FactorizerRefactor2(int myNumber) {

        this.myNumber = myNumber;
        this.numberFactors = getArrayOfFactors();
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    // I could probably set this to static so that I didn't have to instantiate a new object.
    public ArrayList<Integer> getArrayOfFactors(){
        // Create an ArrayList to store factors
        ArrayList<Integer> factors = new ArrayList<>();
        // Iterate through numbers from 1 to the square root of the given number
        for (int i = 1; i <= Math.sqrt(myNumber); i++) {
            // Check if i is a factor of the number
            if (myNumber % i == 0) {
                // Add i to the list of factors
                factors.add(i);

                // This part I do not understand
                if (i != myNumber / i) {
                    factors.add(myNumber / i);
                }
            }
        }
        // Time Complexity : O(sqrt(N)) - 0(logn)
        // Sort the factors in ascending order
        factors.sort(null); // 0(nlogn)
        return factors; //Return the ArrayList of factors
    }

    // I could probably set this to static so that I didn't have to instantiate a new object.
    public boolean checkIfPerfectNumber(ArrayList<Integer> factorArray){
        int arrayLength = factorArray.size();
        int addedFactors = 0;
        for(int i = 0; i < arrayLength - 1; i++ ){
            addedFactors = addedFactors + factorArray.get(i);
        }
        return addedFactors == factorArray.get(arrayLength - 1); // The last element of the array is the user number
    }


    public void printFactors(){
        System.out.println("The factors of " + myNumber + " are:");
        //ArrayList<Integer> numberFactors = getArrayOfFactors();
        for (int n : numberFactors){
            System.out.print(n + " ");
        }
        // Spacing println
        System.out.println();

        // Print the number of factors
        System.out.println(myNumber + " has " + numberFactors.size() + " factors.");
    }

    public void printIfPerfectNumber(){
        boolean isNumberPerfect = checkIfPerfectNumber(numberFactors);
        if (isNumberPerfect){
            System.out.println(myNumber + " is a perfect number.");
        }else {
            System.out.println(myNumber + " is not a perfect number.");
        }
    }

    public void printIfPrime(){
        // If the factors array == 2, then the only numbers the array contains is 1 and the number itself, meaning it's prime - Print the answer.
        if (numberFactors.size() == 2){
            System.out.println(myNumber + "is a prime number.");
        }else {
            System.out.println(myNumber + " is not a prime number.");
        }
    }
}
