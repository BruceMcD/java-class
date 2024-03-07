package com.sg.foundations.basics.arrays;

public class FruitsBasket {

    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
                "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
                "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
                "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
                "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
                "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
                "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        for(String f : fruitBasket){
            if(f == "Orange"){
                numOranges +=1;
            } else if (f == "Apple") {
                numApples +=1;
            }else {
                numOtherFruit +=1;
            }

        }

        System.out.println("Total number of fruit: " + fruitBasket.length);
        System.out.println("number of oragenes: " + numOranges);
        System.out.println("number of Apples: " + numApples);
        System.out.println("number of Other: " + numOtherFruit);


    }
}