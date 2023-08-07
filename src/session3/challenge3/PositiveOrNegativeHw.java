package session3.challenge3;

import java.util.Scanner;

public class PositiveOrNegativeHw {

    public static void main(String[] args) {
        //Write a program to check if a number is positive or negative using logical complement operator.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = input.nextInt();

        if(number > 0){
            System.out.println("This number is positive");
        } else if (number < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is neither positive nor negative");
        }
    }
}
