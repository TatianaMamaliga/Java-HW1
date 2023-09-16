package session14.challenge14.hashSet;

import java.util.HashSet;

public class RetainCommonElements {

    public HashSet<String> retainCommonElements(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> commonEl = new HashSet<>();
        for (String elSet1 : set1) {
            for (String elSet2 : set2) {
                if (elSet1.equals(elSet2)) {
                    commonEl.add(elSet1);
                }
            }
        }
        return commonEl;
    }
}
