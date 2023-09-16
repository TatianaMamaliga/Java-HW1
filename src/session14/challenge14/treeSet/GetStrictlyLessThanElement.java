package session14.challenge14.treeSet;

import java.util.TreeSet;

public class GetStrictlyLessThanElement {

    public void getStrictlyLessThanElement(TreeSet<Integer> treeSet, int comparatorValue) {
        System.out.println("Values strictly less than " + comparatorValue + ":");
        for (int value : treeSet) {
            if (value < comparatorValue) {
                System.out.println(value);
            }
        }
    }
}
