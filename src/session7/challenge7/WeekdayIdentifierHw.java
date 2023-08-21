package session7.challenge7;

import java.time.LocalDate;

public class WeekdayIdentifierHw {

    public static void main(String[] args) {
        LocalDate dateToday = LocalDate.now();
        System.out.println("Today is: " + dateToday + " and " + findDayOfWeek(dateToday));
    }

    public static String findDayOfWeek(LocalDate localDate) {
        String weekDay = String.valueOf(localDate.getDayOfWeek());
        return weekDay;
    }
}
