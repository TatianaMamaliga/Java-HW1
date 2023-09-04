package session11.challenge11.p5;

public abstract class Animals {

    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals {

    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {
        // empty
    }
}

class Dogs extends Animals {

    @Override
    void cats() {
        // empty
    }

    @Override
    void dogs() {
        System.out.println("Dogs bark");
    }
}
