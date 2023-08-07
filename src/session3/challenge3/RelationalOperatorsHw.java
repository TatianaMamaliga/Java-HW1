package session3.challenge3;

import java.util.Scanner;

public class RelationalOperatorsHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number for comparison: ");
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number for comparison: ");
        int secondNumber = input.nextInt();

        String output = numberCheck(firstNumber, secondNumber);
        System.out.println(output);
    }
    public static String numberCheck(int a, int b){
        String result;
        if (a > b){
            result = "First number is greater than the second number.";
        } else if (a < b){
            result = "Second number is greater than the first one.";
        } else {
            result = "The two numbers are equal.";
        }
        return result;
    }
}
