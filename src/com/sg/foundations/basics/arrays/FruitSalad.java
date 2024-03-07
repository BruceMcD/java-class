package com.sg.foundations.basics.arrays;

public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];

        // Code Recipe for fruit salad should go here!
        int numberOfApples = 0;
        int numberOfOranges = 0;
        int count = 0;

        for (String s : fruit) {
            if (s.contains("Apple") && numberOfApples < 3) {
                fruitSalad[count] = fruit[count];
                numberOfApples += 1;
                count++;
            } else if (s.contains("Orange") && numberOfOranges < 2) {
                fruitSalad[count] = s;
                numberOfOranges += 1;
                count++;
            } else if (s.contains("berry")) {
                fruitSalad[count] = s;
                count++;
            }
        }
        for (String f : fruitSalad){
            System.out.println(" " + f + " ");
        }
        }

    }
