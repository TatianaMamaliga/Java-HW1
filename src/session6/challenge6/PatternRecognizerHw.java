package session6.challenge6;

public class PatternRecognizerHw {
    public static void main(String[] args) {
        String inputString = "ababababb";
        String pattern = findRepeatedPattern(inputString);

        if (pattern != null) {
            System.out.println("The repeating pattern is: " + pattern);
        } else {
            System.out.println("No repeating pattern found.");
        }
    }

    public static String findRepeatedPattern(String input) {
        StringBuilder patternBuilder = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            patternBuilder.append(input.charAt(i));

            int patternLength = patternBuilder.length();
            int remainder = length % patternLength;

            if (remainder == 0) {
                int repetitions = length / patternLength;
                String potentialPattern = patternBuilder.toString();
                String reconstructedString = new String(new char[repetitions]).replace("\0", potentialPattern);

                if (reconstructedString.equals(input)) {
                    return potentialPattern;
                }
            }
        }
        return null;
    }
}

