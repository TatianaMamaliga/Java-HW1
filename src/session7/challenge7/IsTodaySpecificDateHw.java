package session7.challenge7;

import java.time.LocalDate;

public class IsTodaySpecificDateHw {

    public static void main(String[] args) {
        System.out.println(isTodaySpecificDate());
    }

    public static boolean isTodaySpecificDate() {
        LocalDate specificDate = LocalDate.parse("2019-12-10");
        LocalDate todayDate = LocalDate.now();

        return specificDate.equals(todayDate);
    }
}
