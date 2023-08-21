package session7.challenge7;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class IntervalBetweenDatesHw {

    public static void main(String[] args) {
        daysBetween();
    }

    public static void daysBetween() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first date (format YYYY:MM:DD):");
        LocalDate firstDate = LocalDate.parse(scanner.next());
        System.out.println("Please enter the second date (format YYYY:MM:DD):");
        LocalDate secondDate = LocalDate.parse(scanner.next());

        Duration duration = Duration.between(secondDate.atStartOfDay(), firstDate.atStartOfDay());

        long days = duration.toDays();

        if (days < 0) {
            days = -days;
        }

        System.out.println("The difference is: " + days + " days");
    }
}
