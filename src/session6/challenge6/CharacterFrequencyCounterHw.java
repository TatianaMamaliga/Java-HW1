package session6.challenge6;

public class CharacterFrequencyCounterHw {

    public static void main(String[] args) {
        String inputString = "java is fantastic";

        int[] freq = new int[inputString.length()];
        char[] string = inputString.toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[i] != '\0') {
                    // '\0' - NULL character - ASCII
                    freq[i]++;
                    string[j] = '\0';
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '\0') {
                result.append(string[i]).append("-").append(freq[i]).append("; ");
            }
        }
        System.out.print(result);
    }
}
