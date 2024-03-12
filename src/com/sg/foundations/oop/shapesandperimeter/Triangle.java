package com.sg.foundations.oop.shapesandperimeter;

public class Triangle extends Shape {
    private int length;


    public Triangle(String colour, int length) {
        super(colour);
        this.length = length;
    }

    @Override
    public double getArea() {
        return (double) ((length * length) / 2);
    }

    @Override
    public double getPerimeter() {
        return length * 3;
    }
}
