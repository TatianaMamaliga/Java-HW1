package session12.practice.virtualMethods;

public class FruitTaste {

    public static void main(String[] args) {
        printFruitDetails(new Apple());
        printFruitDetails(new Orange());
    }

    public static void printFruitDetails(Fruit fruit) {
        System.out.println("Taste: " + fruit.taste());
        System.out.println("Colour: " + fruit.colour());
    }
}
