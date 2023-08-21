package session7.challenge7;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayTodaysDateHw {

    public static void main(String[] args) {
        LocalDateTime todayDate = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = todayDate.format(format);
        System.out.println(formattedDate);
    }
}
