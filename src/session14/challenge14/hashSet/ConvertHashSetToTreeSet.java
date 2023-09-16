package session14.challenge14.hashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet {

    public TreeSet<String> convertHashSetToTreeSet(HashSet<String> set) {
        return new TreeSet<>(set);
    }
}
