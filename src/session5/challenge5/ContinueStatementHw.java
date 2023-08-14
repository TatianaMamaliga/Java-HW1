package session5.challenge5;

import java.util.Scanner;

public class ContinueStatementHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 numbers: ");

        for (int i = 1; i <= 10; i++){
            System.out.println("Enter number " + i + ":");
            int number = input.nextInt();

            if (number < 5){
                continue;
            }
            sum += number;
        }
        System.out.println("Sum of numbers greater than 5, is: " + sum);
    }
}
