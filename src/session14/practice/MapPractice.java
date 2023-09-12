package session14.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> myMap = extractedMap();
        System.out.println(retrieveValue(myMap, "one"));
        System.out.println(updateMap(myMap, "three", 4));
        System.out.println(removeEntry(myMap, "three"));
    }

    private static Map<String, Integer> extractedMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        return myMap;
    }

    private static Integer retrieveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    private static Map<String, Integer> updateMap(Map<String, Integer> map, String key, Integer value) {
        map.put(key, value);
        return map;
    }

    private static Map<String, Integer> removeEntry(Map<String, Integer> map, String key) {
        map.remove(key);
        return map;
    }
}
