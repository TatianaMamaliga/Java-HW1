package session6.challenge6;

public class VowelRemoverHw {

    public static void main(String[] args) {
        String result = removeVowels("Palindrome");
        System.out.println(result);
    }

    public static String removeVowels(String str) {
        StringBuilder wordWithoutVowels = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            char letter = str.charAt(index);
            if (!"aeiou".contains(Character.toString(letter))) {
                wordWithoutVowels.append(letter);
            }
        }
        return wordWithoutVowels.toString();
    }
}

