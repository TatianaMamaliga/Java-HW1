package session5.challenge5;

import java.util.Scanner;

public class EvenOrOddCheckerHw {

    public static void main(String[] args) {
        evenOrOdd();
    }

    public static void evenOrOdd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int inputNum = input.nextInt();
        if (inputNum % 2 == 0) {
            System.out.println(inputNum + " is an even number.");
        } else {
            System.out.println(inputNum + " is an odd number.");
        }
    }
}
