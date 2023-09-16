package session14.challenge14.treeSet;

import java.util.TreeSet;

public class GetLessThanOrEqualToElement {

    public void getLessThanOrEqualToElement(TreeSet<Integer> treeSet, int limit) {
        for (int el : treeSet) {
            if (el <= limit) {
                System.out.println("Element less than or equal to " + limit + " is " + el);
            }
        }
    }
}
