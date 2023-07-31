import java.util.Scanner;
// Write a program that asks the user to enter two numbers, performs addition on those numbers, and prints out the result.
public class SimpleInOut {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

        int sum = add(firstNumber, secondNumber);
        System.out.println("The sum is: " + sum);

        input.close();
    }
    public static int add(int a, int b){
        return a + b;
    }
}
