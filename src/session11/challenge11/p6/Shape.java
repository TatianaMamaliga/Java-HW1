package session11.challenge11.p6;

import session3.RectangleArea;

public abstract class Shape {

    abstract double rectangleArea(double length, double breadth);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends Shape {

    public Area() {
    }

    @Override
    public double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    public double squareArea(double side) {
        return side * side;
    }

    @Override
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
