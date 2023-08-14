package session5.challenge5;

import java.util.Scanner;

public class WhileLoopHw {

    public static void main(String[] args) {
        numberCheck();
    }

    public static void numberCheck() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter numbers, enter -1 to stop: ");
        while (true) {
            int number = input.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of entered numbers (excluding -1) is: " + sum);
    }
}
