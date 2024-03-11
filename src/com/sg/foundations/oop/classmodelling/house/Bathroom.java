package com.sg.foundations.oop.classmodelling.house;

public class Bathroom {

    private boolean hasBath;
    private boolean hasShower;
    private double length;
    private double width;

    public Bathroom(boolean hasBath, boolean hasShower, double length, double width) {
        this.hasBath = hasBath;
        this.hasShower = hasShower;
        this.length = length;
        this.width = width;
    }

    public boolean isHasBath() {
        return hasBath;
    }

    public void setHasBath(boolean hasBath) {
        this.hasBath = hasBath;
    }

    public boolean isHasShower() {
        return hasShower;
    }

    public void setHasShower(boolean hasShower) {
        this.hasShower = hasShower;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
