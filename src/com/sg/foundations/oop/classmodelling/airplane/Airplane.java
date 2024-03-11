package com.sg.foundations.oop.classmodelling.airplane;

public class Airplane {

    // Model an airplane as if the class were to be part of an air traffic control system.

    private double longitude;

    private double latitude;

    private String planeName;

    public Airplane(double longitude, double latitude, String planeName) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.planeName = planeName;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }
}
