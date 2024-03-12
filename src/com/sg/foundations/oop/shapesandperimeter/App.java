package com.sg.foundations.oop.shapesandperimeter;

public class App {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red", 3,4);
        Square square = new Square("Blue", 3);
        Triangle triangle = new Triangle("Yellow", 4);
        Circle circle = new Circle("Green", 3);

        Shape[] myShapes = new Shape[4];
        myShapes[0] = rectangle;
        myShapes[1] = square;
        myShapes[2] = triangle;
        myShapes[3] = circle;

        for(Shape s : myShapes){
            System.out.println("Colour");
            System.out.println(s.getColour());
            System.out.println("Area");
            System.out.println(s.getArea());
            System.out.println("Perimeter");
            System.out.println(s.getPerimeter());
        }
    }
}
