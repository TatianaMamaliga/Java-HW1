package session8.challenge8;

import java.util.*;

public class SortingBasedOnLengthHw {

    public static void main(String[] args) {
        List<String> fruitNameList = new ArrayList<>();
        fruitNameList.add("Melon");
        fruitNameList.add("Lemon");
        fruitNameList.add("Orange");
        fruitNameList.add("Kiwi");
        fruitNameList.add("Apple");

        Collections.sort(fruitNameList, new CustomComparator());

        System.out.println("Sorted fruit names below:");
        for (String fruitName : fruitNameList){
            System.out.println(fruitName);
        }
    }

    static class CustomComparator implements Comparator<String> {
        public int compare(String fruit1, String fruit2) {
            int lengthComparison = Integer.compare(fruit1.length(), fruit2.length());

            if (lengthComparison == 0) {
                return fruit1.compareTo(fruit2);
            }
            return lengthComparison;
        }
    }
}
