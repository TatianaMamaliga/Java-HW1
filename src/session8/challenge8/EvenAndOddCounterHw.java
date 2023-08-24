package session8.challenge8;

public class EvenAndOddCounterHw {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = 0;

        System.out.println("There are: " + evenNumbersCounter(numbers, counter) + " even numbers.");
        System.out.println("There are: " + oddNumbersCounter(numbers, counter) + " odd numbers.");
    }

    public static int evenNumbersCounter(int[] numbers, int counter){
        for (int number : numbers) {
            if (number % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int oddNumbersCounter(int[] numbers, int counter){
        for (int number : numbers) {
            if (number % 2 != 0){
                counter++;
            }
        }
        return counter;
    }
}
