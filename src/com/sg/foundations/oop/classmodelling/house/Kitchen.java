package com.sg.foundations.oop.classmodelling.house;

public class Kitchen {

    private double length;
    private double width;
    private boolean hasIsland;
    private String cabinetColour;

    public Kitchen(double length, double width, boolean hasIsland, String cabinetColour) {
        this.length = length;
        this.width = width;
        this.hasIsland = hasIsland;
        this.cabinetColour = cabinetColour;
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

    public boolean isHasIsland() {
        return hasIsland;
    }

    public void setHasIsland(boolean hasIsland) {
        this.hasIsland = hasIsland;
    }

    public String getCabinetColour() {
        return cabinetColour;
    }

    public void setCabinetColour(String cabinetColour) {
        this.cabinetColour = cabinetColour;
    }
}
