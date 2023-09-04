package session11.practice.abstractionPractice;

public abstract class Shape {

    private String name = "some shape name";

    abstract double area();
    abstract double perimeter();

    String getShapeName() {
        return name;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

}

class Rectangle extends Shape {
    private double length, width;

    private Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length * width);
    }
}
