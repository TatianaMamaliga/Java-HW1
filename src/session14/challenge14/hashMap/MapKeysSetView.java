package session14.challenge14.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MapKeysSetView {

    public void mapKeysSetView(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
