package session6.challenge6;

public class StringReverserHw {

    public static void main(String[] args) {
        String greeting = "hello";
        char[] greetingCharArray = greeting.toCharArray();

        System.out.println(stringReverser(greetingCharArray));
    }

    public static StringBuilder stringReverser(char[] wordArray) {
        StringBuilder reversedGreeting = new StringBuilder();

        for (int index = wordArray.length - 1; index >= 0; index--) {
            reversedGreeting.append(wordArray[index]);
        }
        return reversedGreeting;
    }
}
