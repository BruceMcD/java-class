package com.sg.foundations.flowcontrol.whiles;

public class AASimpleDoWhile {
    public static void main(String[] args) {
        // Initialize a variable
        int count = 0;

        // Execute the loop at least once
        do {
            // Print the current value of count
            System.out.println("Count: " + count);

            // Increment count
            count++;
        } while (count < 5);

        // Additional code here...
    }
}
