package session7.challenge7;

import java.time.LocalDate;
import java.util.Scanner;

public class CompareDatesByUserHw {

    public static void main(String[] args) {
        System.out.println(areDatesEqual());
    }

    public static boolean areDatesEqual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first date (format YYYY-MM-DD) for comparison: ");
        LocalDate firstDate = LocalDate.parse(scanner.next());
        System.out.println("Enter the second date (format YYYY-MM-DD) for comparison: ");
        LocalDate secondDate = LocalDate.parse(scanner.next());

        return firstDate.equals(secondDate);
    }
}
