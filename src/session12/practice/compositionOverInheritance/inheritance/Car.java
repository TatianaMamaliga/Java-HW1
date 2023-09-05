package session12.practice.compositionOverInheritance.inheritance;

public class Car extends Engine {

    @Override
    void start() {
        System.out.println("car is moving");
    }
}
