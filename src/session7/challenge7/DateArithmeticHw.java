package session7.challenge7;

import java.time.LocalDate;

public class DateArithmeticHw {

    public static void main(String[] args) {
        int weeksToAdd = 4;
        System.out.println(addWeeksToToday(weeksToAdd));
    }

    public static LocalDate addWeeksToToday(int weeksToAdd) {
        LocalDate dateNow = LocalDate.now();
        return dateNow.plusWeeks(weeksToAdd);
    }
}
