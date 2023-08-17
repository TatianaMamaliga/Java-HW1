package session6.challenge6;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderConcatHw {

    public static void main(String[] args) {
        List stringList = new ArrayList<>();
        stringList.add("Use");
        stringList.add("the");
        stringList.add("force");
        stringList.add("Luke");

        StringBuilder fullSentence = new StringBuilder();

        for (int index = 0; index < stringList.size(); index++) {
            fullSentence.append(stringList.get(index));
            if (index == stringList.size() - 1) {
                fullSentence.append(".");
            }
            fullSentence.append(" ");
        }
        System.out.println(fullSentence);
    }
}
