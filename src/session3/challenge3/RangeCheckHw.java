package session3.challenge3;

import java.util.Scanner;

public class RangeCheckHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 30");
        int number = input.nextInt();
        if(number < 30 && number > 0){
            System.out.println("Well done! The number is within specified range.");
        } else {
            System.out.println("Number is out of range.");
        }
    }
}
