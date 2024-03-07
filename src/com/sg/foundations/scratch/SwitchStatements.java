package com.sg.foundations.scratch;

public class SwitchStatements {
    public static void main(String[] args) {

        int x, y;
        x = 1;
        y = 4;

        switch (x) {
            case 1:
                System.out.println("x is one!");
                break;
            case 2:
                System.out.println("x is two");
                break;
            case 3:
                System.out.println("x is three");
                break;
            default:
                System.out.println("x is something else");
                break;
        }

    }
}
