package session3.challenge3;

import java.util.Scanner;

public class IncrementDecrementOneHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Initial value is: " + number);
        ++number;
        System.out.println("Incremented by 1, the value is: " + number);
        --number;
        System.out.println("Decremented by 1, the value is: " + number);
    }
}
