package session15.practice.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class WildCardPractice {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Jane", "John");
        List<Integer> integerList = Arrays.asList(13, 17);

        printFirstClass(stringList);
        printFirstClass(integerList);
    }

    private static void printFirstClass(List<?> list) {
        if (!list.isEmpty()) {
            System.out.println(list.get(0).getClass().getSimpleName());
        }
    }
}
