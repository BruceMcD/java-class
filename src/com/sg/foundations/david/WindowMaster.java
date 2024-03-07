package com.sg.foundations.david;

import java.util.Scanner;

public class WindowMaster {

    public static void main(String [] args) {
        // declare variables for height and width
        float height = 0;
        float width = 0;

        // declare String variables to hold the user's height and
        // width input
        String stringHeight = "0";
        String stringWidth = "0";
        String stringNumberOfWindows = "0";

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // refactored variable
        int numberOfWindows;

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        boolean isValid = false;
        do {

            try {
                System.out.println("Please enter window height:  ");

                stringHeight = myScanner.nextLine();
                height = Float.parseFloat(stringHeight);

                if (height > 0) {
                    isValid = true;
                }

            } catch(NumberFormatException ex) {
                System.out.println("That was not a whole number!");
            }

        } while(!isValid);


        isValid = false;
        do {

            try {
                System.out.println("Please enter window width:  ");

                stringWidth = myScanner.nextLine();
                width = Float.parseFloat(stringWidth);

                if (width > 0) {
                    isValid = true;
                }

            } catch(NumberFormatException ex) {
                System.out.println("That was not a whole number!");
            }

        } while(!isValid);

        isValid = false;
        do {

            try {
                System.out.println("Please enter number of windows:  ");

                stringNumberOfWindows = myScanner.nextLine();
                numberOfWindows = Integer.parseInt(stringNumberOfWindows);

                if (numberOfWindows > 0) {
                    isValid = true;
                }

            } catch(NumberFormatException ex) {
                System.out.println("That was not a whole number!");
            }

        } while(!isValid);

        // convert String values of height and width to float values

        width = Float.parseFloat(stringWidth);
        numberOfWindows = Integer.parseInt(stringNumberOfWindows);

        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // calculate the total cost - use a hard-coded value
        // for material cost
        cost = (((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow))) * numberOfWindows;

        // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Number of windows = " + stringNumberOfWindows);
        System.out.println("Total Cost =  " + cost);
    }

}
