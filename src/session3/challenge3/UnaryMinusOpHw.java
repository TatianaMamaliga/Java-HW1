package session3.challenge3;

import java.util.Scanner;

public class UnaryMinusOpHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("To change the integer sign, Java uses the unary minus operator and the result is:  " + (-number));
    }
}
