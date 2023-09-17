package session14.challenge14.hashMap;

import java.util.HashMap;

public class HashMapShallowCopy {

    public HashMap<String, String> hashMapShallowCopy(HashMap<String, String> map) {
        return (HashMap<String, String>) map.clone();
    }
}
