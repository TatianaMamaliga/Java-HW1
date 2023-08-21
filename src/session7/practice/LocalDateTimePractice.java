package session7.practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        printLocalDateTimeDecrement(localDateTime,5 );

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.now().plusWeeks(7);

        printLocalDateTimeDifference(start, end);

        printFormattedDateTime(localDateTime);

    }

    public static void printLocalDateTimeDecrement(LocalDateTime localDateTime, long decrementHrs){
        System.out.println(localDateTime.minusHours(decrementHrs));
    }

    public static void printLocalDateTimeDifference(LocalDateTime localDateTimeStart, LocalDateTime localDateTimeEnd){
        Duration duration = Duration.between(localDateTimeStart, localDateTimeEnd);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();

        System.out.printf("Time difference is %d hours, %d minutes, %d seconds", hours, minutes, seconds );
    }

    public static void printFormattedDateTime(LocalDateTime localDateTime){
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = localDateTime.format(dateTimeFormat);
        System.out.println("\n" + formatDateTime);
    }
}
