package session4.challenge4;

public class TernaryOperatorTriangleHw {

    public static void main(String[] args) {
        int sideOne = 5;
        int sideTwo = 7;
        int sideThree = 5;

        String triangleType =
                (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
                (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "Isosceles" : "Scalene";

        System.out.println("The triangle is: " + triangleType);
    }
}
