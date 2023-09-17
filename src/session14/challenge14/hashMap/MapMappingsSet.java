package session14.challenge14.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MapMappingsSet {

    public void mapMappingsSet(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " - Capital: " + entry.getValue());
        }
    }
}
