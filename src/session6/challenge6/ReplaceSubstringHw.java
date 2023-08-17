package session6.challenge6;

public class ReplaceSubstringHw {

    public static void main(String[] args) {
        String originalString = "The cat sat on a mat";
        String oldSubstring = "cat";
        String newSubstring = "dog";

        String modifiedString = replaceSubstring(originalString, oldSubstring, newSubstring);
        System.out.println(modifiedString);
    }

    public static String replaceSubstring(String input, String oldSub, String newSub) {
        StringBuilder result = new StringBuilder();
        int startIndex = 0;
        int oldSubIndex;

        while ((oldSubIndex = input.indexOf(oldSub, startIndex)) != -1) {
            result.append(input, startIndex, oldSubIndex);
            result.append(newSub);
            startIndex = oldSubIndex + oldSub.length();
        }
        result.append(input, startIndex, input.length());

        return result.toString();
    }
}
