package session11.challenge11.p6;

public class ShapeImpl {

    public static void main(String[] args) {
        Area shape = new Area();

        double rectangleArea = shape.rectangleArea(3, 8);
        System.out.println(rectangleArea);
        double squareArea = shape.squareArea(19);
        System.out.println(squareArea);
        double circleArea = shape.circleArea(11);
        System.out.println(circleArea);
    }
}
