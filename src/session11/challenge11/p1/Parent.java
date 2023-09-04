package session11.challenge11.p1;

public abstract class Parent {

    abstract void message();
}

class FirstSubclass extends Parent {

    @Override
    void message() {
        System.out.println("This is first subclass");
    }

    public FirstSubclass() {
    }
}

class SecondSubclass extends Parent {

    @Override
    void message() {
        System.out.println("This is second subclass");
    }

    public SecondSubclass() {
    }
}




