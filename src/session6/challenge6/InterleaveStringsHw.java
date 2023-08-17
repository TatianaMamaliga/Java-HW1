package session6.challenge6;

public class InterleaveStringsHw {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "123";
        String interleavedString = interleaveStrings(str1, str2);
        System.out.println(interleavedString);
    }

    public static String interleaveStrings(String str1, String str2) {
        StringBuilder interleaved = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            interleaved.append(str1.charAt(i));
            interleaved.append(str2.charAt(i));
        }

        interleaved.append(str1.substring(minLength));
        interleaved.append(str2.substring(minLength));

        return interleaved.toString();
    }
}
