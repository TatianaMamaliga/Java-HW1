package session5.challenge5;

import java.util.Scanner;

public class StringReverserHw {

    public static void main(String[] args) {
        reverseString();
    }

    public static void reverseString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to be reversed: ");
        String initialString = input.next();

        char[] stringChar = initialString.toCharArray();

        for (int index = stringChar.length - 1; index >= 0; index--){
            System.out.print(stringChar[index]);
        }
    }
}
