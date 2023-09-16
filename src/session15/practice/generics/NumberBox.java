package session15.practice.generics;

public class NumberBox<T extends Number> {

    private T number;

    public void set(T number) {
        this.number = number;
    }

    public double aDoubleNumber() {
        return number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.set(10);

        System.out.println(integerNumberBox.aDoubleNumber());
    }

}
