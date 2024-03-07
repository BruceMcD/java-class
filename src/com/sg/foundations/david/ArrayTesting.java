package com.sg.foundations.david;

public class ArrayTesting {

    public static void jaggedArray() {
        String[][] strArray = {{"This", "is"}, {"a", "test", "of", "jagged arrays"}};

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.print(strArray[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void printArrOfStrings(String[] theArray){
        for(String s : theArray){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        String[] myBunchOfStrings = {"Bruce", "Sam", "David", "Deepak"};

        printArrOfStrings(myBunchOfStrings);

        myBunchOfStrings[1] = "Brandon";
        System.out.println("After Change:");
        printArrOfStrings(myBunchOfStrings);

        jaggedArray();



    }


}
