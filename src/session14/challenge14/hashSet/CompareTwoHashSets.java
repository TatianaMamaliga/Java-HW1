package session14.challenge14.hashSet;

import java.util.HashSet;

public class CompareTwoHashSets {

    public boolean compareTwoHashSets(HashSet<String> set1, HashSet<String> set2) {
        return set1.containsAll(set2);
    }
}
