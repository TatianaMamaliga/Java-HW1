package session7.challenge7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDecompositionHw {

    public static void main(String[] args) {
        LocalDateTime todayDate = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = todayDate.format(format);

        displayDateComponents(formattedDate);
    }

    public static void displayDateComponents(String input) {
        String[] strArr = input.split("-");

        String year = strArr[0];
        String month = strArr[1];
        String day = strArr[2];

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
