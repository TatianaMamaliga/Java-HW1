package session3;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int firstNumber = 9;
        int secondNumber = 8;

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        float quotient = (float) firstNumber / secondNumber;
        int reminder = firstNumber % secondNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Reminder: " + reminder);
    }
}
