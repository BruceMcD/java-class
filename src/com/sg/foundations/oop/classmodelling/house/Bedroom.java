package com.sg.foundations.oop.classmodelling.house;

public class Bedroom {

    private double bedroomLength;
    private double bedroomWidth;
    private boolean isMainBedroom;
    private int numberOfBeds;

    public Bedroom(double bedroomLength, double bedroomWidth, boolean isMainBedroom, int numberOfBeds) {
        this.bedroomLength = bedroomLength;
        this.bedroomWidth = bedroomWidth;
        this.isMainBedroom = isMainBedroom;
        this.numberOfBeds = numberOfBeds;
    }

    public double getBedroomLength() {
        return bedroomLength;
    }

    public void setBedroomLength(double bedroomLength) {
        this.bedroomLength = bedroomLength;
    }

    public double getBedroomWidth() {
        return bedroomWidth;
    }

    public void setBedroomWidth(double bedroomWidth) {
        this.bedroomWidth = bedroomWidth;
    }

    public boolean isMainBedroom() {
        return isMainBedroom;
    }

    public void setMainBedroom(boolean mainBedroom) {
        isMainBedroom = mainBedroom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}
