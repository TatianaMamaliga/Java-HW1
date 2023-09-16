package session14.challenge14.treeSet;

import java.util.TreeSet;

public class FindNumbersLessThan7 {

    public void findNumbersLessThan7(TreeSet<Integer> treeSet) {
        System.out.println("Numbers less than 7:");
        for (int num : treeSet) {
            if (num < 7) {
                System.out.println(num);
            }
        }
    }
}
