package session6.challenge6;

public class ToggleCaseHw {

    public static void main(String[] args) {
        String inputString = "HelLo";
        String toggledString = toggleCase(inputString);
        System.out.println(toggledString);
    }

    public static String toggleCase(String input) {
        StringBuilder toggled = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }
        return toggled.toString();
    }
}
