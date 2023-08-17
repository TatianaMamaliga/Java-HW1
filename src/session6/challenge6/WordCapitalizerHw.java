package session6.challenge6;

public class WordCapitalizerHw {

    public static void main(String[] args) {
        String sentence = "august is the last summer month.";
        String capitalizedSentence = capitalizeWords(sentence);
        System.out.println(capitalizedSentence);
    }

    public static String capitalizeWords(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            } else {
                c = Character.toLowerCase(c);
            }
            result.append(c);
        }
        return result.toString();
    }
}
