package session8.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Randy");
        names.add("Maddie");
        names.add("Pete");
        names.add("Nathan");

        names.add(2, "Kyle");
        names.remove("Randy");
        boolean isListEmpty = names.isEmpty();
        int listSize = names.size();

        System.out.println("Is list empty? " + isListEmpty + " and length is, of course: " + listSize);
        System.out.println(names);
    }
}
