package com.sg.foundations.oop.shapesandperimeter;

public class Circle extends Shape {

    private int diameter;

    public Circle(String colour, int diameter) {
        super(colour);
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return Math.PI * (((double) diameter /2) * ((double) diameter /2));
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * ((double) diameter /2);
    }
}
