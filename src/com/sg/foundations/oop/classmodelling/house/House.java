package com.sg.foundations.oop.classmodelling.house;

public class House {

    //Model a house as if the class were to be part of a 3-D design system
    private int numberOfBedrooms;
    private Kitchen kitchen;
    private Bedroom[] bedroomsList;
    private int streetNumber;
    private String postCode;

    private Bathroom bathroom;

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public House(int numberOfBedrooms, Kitchen kitchen, Bedroom[] bedroomsList, int streetNumber, String postCode, Bathroom bathroom) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.kitchen = kitchen;
        this.bedroomsList = bedroomsList;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
        this.bathroom = bathroom;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Bedroom[] getBedroomsList() {
        return bedroomsList;
    }

    public void setBedroomsList(Bedroom[] bedroomsList) {
        this.bedroomsList = bedroomsList;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }
}
