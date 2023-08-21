package session7.challenge7;

import java.util.Scanner;

public class DateAuthenticatorHw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date to be validated (check for YYYY-MM-DD format):");
        String userDate = scanner.nextLine();

        if (isValidDate(userDate)) {
            System.out.println("The date is valid.");
        } else {
            System.out.println("The date is invalid.");
        }
    }

    public static boolean isValidDate(String dateInput) {
        if (!dateInput.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        String[] components = dateInput.split("-");
        int year = Integer.parseInt(components[0]);
        int month = Integer.parseInt(components[1]);
        int day = Integer.parseInt(components[2]);

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }
        return true;
    }
}
