package session3.challenge3;

import java.util.Scanner;

public class ArithmeticOperationsHw {
    //Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = input.nextInt();

        int sum = addition(firstNumber, secondNumber);
        int difference = subtraction(firstNumber, secondNumber);
        int product = multiplication(firstNumber, secondNumber);
        int divisionResult = division(firstNumber, secondNumber);
        int modulusResult = modulus(firstNumber, secondNumber);

        System.out.println("This is the addition result: " + sum);
        System.out.println("This is the subtraction result: " + difference);
        System.out.println("This is the multiplication result: " + product);
        System.out.println("This is the division result: " + divisionResult);
        System.out.println("This is the modulus result: " + modulusResult);
    }
        public static int addition(int a, int b){
        return a + b;
        }
        public static int subtraction(int a, int b){
            return a - b;
        }
        public static int multiplication(int a, int b){
        return a * b;
        }
        public static int division(int a, int b){
        return a / b;
        }
        public static int modulus(int a, int b){
        return a % b;
        }
}
