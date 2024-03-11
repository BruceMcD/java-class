package com.sg.foundations.oop.classmodelling.car;

public class Car {

    // Model a car as if the class were to be part of a video game.

    private String carModel;

    private double spawnLongitude;

    private double spawnLatitude;

    private String colour;

    public Car(String carModel, double spawnLongitude, double spawnLatitude, String colour) {
        this.carModel = carModel;
        this.spawnLongitude = spawnLongitude;
        this.spawnLatitude = spawnLatitude;
        this.colour = colour;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getSpawnLongitude() {
        return spawnLongitude;
    }

    public void setSpawnLongitude(double spawnLongitude) {
        this.spawnLongitude = spawnLongitude;
    }

    public double getSpawnLatitude() {
        return spawnLatitude;
    }

    public void setSpawnLatitude(double spawnLatitude) {
        this.spawnLatitude = spawnLatitude;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
