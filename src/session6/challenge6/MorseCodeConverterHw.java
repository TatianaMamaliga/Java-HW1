package session6.challenge6;

public class MorseCodeConverterHw {
    public static void main(String[] args) {
        String inputString = "hello123";
        String morseCode = convertToMorseCode(inputString);
        System.out.println(morseCode);
    }

    public static String convertToMorseCode(String input) {
        input = input.toLowerCase();
        StringBuilder morseCodeBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                String code = getMorseCode(c);
                morseCodeBuilder.append(code).append(" ");
            }
        }

        return morseCodeBuilder.toString();
    }

    public static String getMorseCode(char c) {
        switch (c) {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return ".--";
            case 'x':
                return "-..-";
            case 'y':
                return "-.--";
            case 'z':
                return "--..";
            case '0':
                return "-----";
            case '1':
                return ".----";
            case '2':
                return "..---";
            case '3':
                return "...--";
            case '4':
                return "....-";
            case '5':
                return ".....";
            case '6':
                return "-....";
            case '7':
                return "--...";
            case '8':
                return "---..";
            case '9':
                return "----.";
            default:
                throw new IllegalArgumentException("Character not supported: " + c);
        }
    }
}

