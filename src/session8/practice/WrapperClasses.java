package session8.practice;

public class WrapperClasses {

    public static void main(String[] args) {
        int number = 2;
        Integer number2 = Integer.valueOf(number);
        Integer autoboxedNumber = 10;

        String randomNumber = "12";
        Integer randomNumberAsInteger = Integer.parseInt(randomNumber);

        printRoundedNumber("12.89");
    }

    public static void printRoundedNumber(String number) {
        Double doubleNumber = Double.parseDouble(number);
        long roundedNumber = Math.round(doubleNumber);

        System.out.println(roundedNumber);
    }
}
