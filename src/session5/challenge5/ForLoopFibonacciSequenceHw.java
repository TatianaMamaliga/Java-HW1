package session5.challenge5;

public class ForLoopFibonacciSequenceHw {

    public static void main(String[] args) {
        int number = 10;
        int num1 = 0, num2 = 1;

        System.out.println("First " + number + " numbers in the Fibonacci series.");
        for (int i = 0; i <= number; i++) {
            System.out.println(num1 + " ");
            int nextNumber = num1 + num2;
            num1 = num2;
            num2 = nextNumber;
        }
    }
}
