package session14.challenge14.treeSet;

import java.util.TreeSet;

public class GetGreaterThanOrEqualToElement {

    public void getGreaterThanOrEqualToElement(TreeSet<Integer> treeSet, int limit) {
        for (int el : treeSet) {
            if (el >= limit) {
                System.out.println("Element greater than or equal to " + limit + " is " + el);
            }
        }
    }
}
