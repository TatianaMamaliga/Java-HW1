package session6.challenge6;

public class AnagramCheckerHw {

    public static void main(String[] args) {
        String str1 = "inch";
        String str2 = "chins";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " aren't anagrams");
        }
    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord == null || secondWord == null || firstWord.length() != secondWord.length()) {
            return false;
        }

        int[] charCount = new int[256];

        for (char c : firstWord.toCharArray()) {
            charCount[c]++;
        }

        for (char c : secondWord.toCharArray()) {
            charCount[c]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
