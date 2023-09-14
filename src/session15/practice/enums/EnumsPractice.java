package session15.practice.enums;

public class EnumsPractice {

    public static void main(String[] args) {
        printEnumValues();
        printDayMessage(Day.WEDNESDAY);
    }

    private static void printEnumValues() {
        for (Day day : Day.values()) {
            System.out.println(day + " is weekday? : " + day.isWeekday());
        }
    }

    private static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start of the week! Power up!");
            case TUESDAY -> System.out.println("You're doing alright! It's Taco Tuesday!");
            case WEDNESDAY -> System.out.println("You made past half the week!");
            default -> System.out.println("Invalid day.");
        }
    }
}
