package session6.challenge6;

public class CamelCaseToSnakeCaseHw {

    public static void main(String[] args) {
        String camelCaseInput = "someGreatString";
        String snakeCaseResult = convertToSnakeCase(camelCaseInput);
        System.out.println(snakeCaseResult);
    }

    public static String convertToSnakeCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (Character.isUpperCase(currentChar)) {
                result.append("_");
            }
            result.append(Character.toLowerCase(currentChar));
        }
        return result.toString();
    }
}
