package session5.challenge5;

import java.util.Scanner;

public class DoWhileLoopHw {

    public static void main(String[] args) {
        int numberToGuess = 6;
        numberCheck(numberToGuess);
    }
    public static void numberCheck(int number){
        System.out.println("Guess the predefined number: ");
        Scanner input = new Scanner(System.in);
        boolean numberGuessed = false;
        do {
            int guessedNumber = input.nextInt();
            if (guessedNumber == number){
                numberGuessed = true;
            } else if (guessedNumber < number){
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        } while (!numberGuessed);
        if (numberGuessed) {
            System.out.println("Very nice. You guessed.");
        }
    }
}
