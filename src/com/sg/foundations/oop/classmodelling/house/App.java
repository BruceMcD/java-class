package com.sg.foundations.oop.classmodelling.house;

public class App {


    public static void main(String[] args) {
        // This would work better by using inheritance. A bedroom, bathrrom and kitchen are all rooms with the same properties - needs refactored
        // create a kitchen
        Kitchen kitchen = new Kitchen(30,20, true, "White");

        // create an array of bedrooms
        Bedroom[] myBedrooms = new Bedroom[1];
        myBedrooms[0] = new Bedroom(30,20,true,1);

        // create a bathroom
        Bathroom bathroom = new Bathroom(true, true, 30,30);

        // create a house of rooms
        House myHouse = new House(2, kitchen, myBedrooms, 33, "CA10 1BF", bathroom);
    }
}
