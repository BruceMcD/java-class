package com.sg.foundations.oop.shapesandperimeter;

public class Square extends Shape {

    private int length;

    public Square(String colour, int length) {
        super(colour);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }
}
