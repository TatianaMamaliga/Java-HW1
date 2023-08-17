package session6.challenge6;

public class RemoveDuplicatesHw {

    public static void main(String[] args) {
        String inputString = "buzzing";
        String result = removeDuplicates(inputString);
        System.out.println(result);
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
