package session11.challenge11.p3;

public abstract class Marks {

    abstract float getPercentage();
}

class A extends Marks {
    private float mark1 = 8;
    private float mark2 = 7;
    private float mark3 = 10;
    @Override
    float getPercentage() {
        return (mark1 + mark2 + mark3) / 3 * 100 /10;
    }
}

class B extends Marks {

    private float mark1 = 10;
    private float mark2 = 9;
    private float mark3 = 9;
    private float mark4 = 9;

    @Override
    float getPercentage() {
       return (mark1 + mark2 + mark3 + mark4) / 4 * 100 / 10;
    }
}


