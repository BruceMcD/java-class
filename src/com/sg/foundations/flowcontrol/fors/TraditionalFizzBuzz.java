package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int number;

        System.out.println("How many units of fizzing and buzzing do you need in you life?  ");
        number = Integer.parseInt(inputReader.nextLine());

        for (int i = 1; i < number + 1; i++){
            if (i % 3 == 0){
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
