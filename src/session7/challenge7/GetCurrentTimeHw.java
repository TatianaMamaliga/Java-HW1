package session7.challenge7;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentTimeHw {

    public static void main(String[] args) {
        System.out.println(displayCurrentTime());
    }

    public static LocalTime displayCurrentTime() {
        LocalTime timeNow = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime formattedTime = LocalTime.parse(timeNow.format(formatter));

        return formattedTime;
    }
}
