package session6.challenge6;

import static session6.challenge6.StringReverserHw.stringReverser;

public class PalindromeCheckerHw {

    public static void main(String[] args) {
        String word = "ewe";
        char[] wordArray = word.toCharArray();

        if (stringReverser(wordArray).toString().equals(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
