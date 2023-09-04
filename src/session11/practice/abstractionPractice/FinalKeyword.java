package session11.practice.abstractionPractice;

public class FinalKeyword {
}

class Parent {

    final void showMessage() {
        System.out.println("Show some message");
    }
}

class Child extends Parent {

    // method cannot be overridden due to final keyword
//    void showMessage() {
//    }
}
