package session14.challenge14.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashSetToArray {

    public String[] convertHashSetToArray(HashSet<String> set) {
        String[] arr = new String[set.size()];
        set.toArray(arr);
        return arr;
    }
}
