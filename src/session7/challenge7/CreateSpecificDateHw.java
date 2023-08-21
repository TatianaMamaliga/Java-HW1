package session7.challenge7;

import java.time.LocalDate;

public class CreateSpecificDateHw {

    public static void main(String[] args) {
        System.out.println(createSpecificDate());
    }

    public static LocalDate createSpecificDate() {
        LocalDate localDate = LocalDate.now();
        String[] dateArr = localDate.toString().split("-");
        int targetYear = 2025;
        int targetMonth = 8;
        int targetDay = 25;

        int yearsToAdd = targetYear - Integer.parseInt(dateArr[0]);
        int monthsToAdd = targetMonth - Integer.parseInt(dateArr[1]);
        int daysToAdd = targetDay - Integer.parseInt(dateArr[2]);

        return localDate.plusYears(yearsToAdd).plusMonths(monthsToAdd).plusDays(daysToAdd);
    }
}
