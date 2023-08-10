package session4.challenge4;

public class ForLoopFactorialHw {

    public static void main(String[] args) {
        int number = 8;
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial of: " + number + " is: " + result);
    }
}
