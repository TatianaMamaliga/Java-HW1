package session2;

public class Operations {
    // Write a program that performs various operations (addition, subtraction, multiplication, division, and modulus) on two numbers. The numbers can be hard-coded into the program. Print the result of each operation.
    public static void main(String[] args) {
        int firstNum = 30;
        int secondNum = 21;

        int resultSum = sum(firstNum, secondNum);
        int resultSub = subtraction(firstNum, secondNum);
        int resultDiv = division(firstNum, secondNum);
        int resultMod = modulus(firstNum, secondNum);

        System.out.println("Sum result is: " + resultSum);
        System.out.println("Subtraction result is: " + resultSub);
        System.out.println("Division result is: " + resultDiv);
        System.out.println("Modulus result is: " + resultMod);
    }
        public static int sum(int a, int b){
        return a + b;
        }
        public static int subtraction(int a, int b){
        return a - b;
        }
        public static int division(int a, int b){
        return a / b;
        }
        public static int modulus(int a, int b){
        return a % b;
        }
}
