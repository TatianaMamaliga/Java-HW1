package session6.challenge6;

public class RunLengthEncodingHw {

    public static void main(String[] args) {
        String inputString = "AAABBBBCCC";
        String encodedString = runLengthEncode(inputString);
        System.out.println(encodedString);
    }

    public static String runLengthEncode(String input) {
        StringBuilder encodedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encodedString.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }
        encodedString.append(count).append(input.charAt(input.length() - 1));
        return encodedString.toString();
    }
}
