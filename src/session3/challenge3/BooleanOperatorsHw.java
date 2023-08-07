package session3.challenge3;

import java.util.Scanner;

public class BooleanOperatorsHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a boolean value.");
        boolean firstResponse = input.nextBoolean();

        System.out.println("Logical negation operator has been applied to make it: " + !firstResponse);

        System.out.println("Enter another boolean.");
        boolean secResponse = input.nextBoolean();
        System.out.println("Logical negation operator has been applied to make it: " + !secResponse);
    }
}
