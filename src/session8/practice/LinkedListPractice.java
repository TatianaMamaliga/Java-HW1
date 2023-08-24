package session8.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Randy");
        names.add("Maddie");
        names.add("Pete");
        names.add("Nathan");

        names.add(0, "Jerry");

        System.out.println(names);
    }


}
