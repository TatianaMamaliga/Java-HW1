package session14.challenge14.hashSet;

import java.util.HashSet;

public class CloneHashSet {

    public HashSet<String> cloneHashSet(HashSet<String> set) {
        return (HashSet<String>) set.clone();
    }
}
