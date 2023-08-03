package session3;

import java.util.Scanner;

public class ScannerClass {
    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println();
        String userName = "Maria";
        int userAge = 18;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide some text:");
        String userInput = scanner.nextLine();
        System.out.println("Your input is: " + userInput);

        scanner.close();
    }
}
