package session6.challenge6;

public class StringExpanderHw {

    public static void main(String[] args) {
        String compressedString = "a3b2c4";
        String expandedString = expandString(compressedString);
        System.out.println(expandedString);
    }

    public static String expandString(String input) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                count = count * 10 + (charArray[i] - '0');
                for (int j = count; j >= 1; j--) {
                    result.append(charArray[i - 1]);
                    count = 0;
                }
            }
        }
        return result.toString();
    }
}
