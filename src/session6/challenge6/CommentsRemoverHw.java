package session6.challenge6;

public class CommentsRemoverHw {
    public static void main(String[] args) {
        String code =
                "public class CommentsRemoverHw { \n" +
                        "// this is a comment \n" +
                        "/* this is the second \n" +
                        "comment */ \n" +
                        "public static void main(Strings[] args) {\n" +
                        "System.out.println(\"this is a method\")\n" +
                        "}\n" +
                        "}";

        String cleanedCode = removeComments(code);
        System.out.println(cleanedCode);
    }

    public static String removeComments(String code) {
        StringBuilder result = new StringBuilder();
        boolean insideSingleLineComment = false;
        boolean insideMultiLineComment = false;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (insideSingleLineComment) {
                if (c == '\n') {
                    insideSingleLineComment = false;
                }
            } else if (insideMultiLineComment) {
                if (c == '*' && i < code.length() - 1 && code.charAt(i + 1) == '/') {
                    insideMultiLineComment = false;
                    i++;
                }
            } else {
                if (c == '/' && i < code.length() - 1) {
                    char nextChar = code.charAt(i + 1);
                    if (nextChar == '/') {
                        insideSingleLineComment = true;
                        i++;
                    } else if (nextChar == '*') {
                        insideMultiLineComment = true;
                        i++;
                    } else {
                        result.append(c);
                    }
                } else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}