package session12.practice.compileTimePolymorphism;

public class Geometry {

    // method overloading
    // calculates circle area
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // calculates triangle area
    public double area(double base, double height) {
        return base * height * 0.5;
    }
}
