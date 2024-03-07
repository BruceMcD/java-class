package com.sg.foundations.flowcontrol.fors;

public class ForByFor {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    //This is where it's printing
                    if(i == 0 || i == 2){
                        if (j == 0 || j == 2){
                            System.out.print("*");
                        } else if (j == 1) {
                            System.out.print("$");
                        }
                    } else {
                        if (j == 0 || j == 2){
                            System.out.print("@");
                        } else if (j == 1) {
                            System.out.print("#");
                        }
                    }
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}