package com.sg.foundations.variables;

import java.util.ArrayList;
import java.util.List;

public class MenuOfChampions {
    public static void main(String[] args) {


        List<String> myFood = new ArrayList<>();
        List<Integer> myPrices = new ArrayList<>();

        myFood.add("Pizza");
        myFood.add("Gelato");
        myFood.add("Milkshake");

        myPrices.add(7);
        myPrices.add(4);
        myPrices.add(5);

        System.out.println("""
                .oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.
                                
                            WELCOME TO Bruce's RESTAURANT!
                            Today's Menu Is...
                                
                .oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.""");

        for (int i = 0; i <= myFood.size() - 1 ; i++) {
            System.out.println("£ " +  myPrices.get(i) + " *** " +  myFood.get(i));
        }
    }

}
