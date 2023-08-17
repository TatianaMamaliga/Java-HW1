package session6.challenge6;

public class InsertStringAtIndexHw {

    public static void main(String[] args) {
        String initialString = "Your account was created successfully.";
        String insertString = "Congrats! ";
        int insertIndex = 0;

        String result = insertStringAtIndex(initialString, insertString, insertIndex);
        System.out.println(result);
    }

    public static String insertStringAtIndex(String input, String insertValue, int index) {
        StringBuilder result = new StringBuilder(input);

        result.insert(index, insertValue);

        return result.toString();
    }
}
