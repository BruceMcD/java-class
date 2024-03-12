package com.sg.foundations.oop.shapesandperimeter;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String colour, int length, int width) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(String colour) {
        super(colour);
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return ((length*2) + (width*2));
    }

}
