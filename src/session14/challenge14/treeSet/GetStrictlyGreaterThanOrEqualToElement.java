package session14.challenge14.treeSet;

import java.util.TreeSet;

public class GetStrictlyGreaterThanOrEqualToElement {

    public void getStrictlyGreaterThanOrEqualToElement(TreeSet<Integer> treeSet, int comparatorValue) {
        for (int value : treeSet) {
            if (value > comparatorValue || value == comparatorValue) {
                System.out.println(value);
            }
        }
    }
}
