package session14.challenge14.hashMap;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        AssociateValueWithKeyHashMap associateValueWithKey = new AssociateValueWithKeyHashMap();
        MapSizeCounter mapSizeCounter = new MapSizeCounter();
        MapCopy mapCopy = new MapCopy();
        MapClearer mapClearer = new MapClearer();
        MapEmptyChecker mapEmptyChecker = new MapEmptyChecker();
        HashMapShallowCopy hashMapShallowCopy = new HashMapShallowCopy();
        MapKeyPresenceTester mapKeyPresenceTester = new MapKeyPresenceTester();
        MapValuePresenceTester mapValuePresenceTester = new MapValuePresenceTester();
        MapMappingsSet mapMappingsSet = new MapMappingsSet();
        MapValueGetter mapValueGetter = new MapValueGetter();
        MapKeysSetView mapKeysSetView = new MapKeysSetView();
        MapValuesCollectionView mapValuesCollectionView = new MapValuesCollectionView();

        associateValueWithKey.associateValueWithKeyHashMap(map, "Argentina", "Buenos Aires");
        associateValueWithKey.associateValueWithKeyHashMap(map, "Nigeria", "Abuja");
        associateValueWithKey.associateValueWithKeyHashMap(map, "Sweden", "Stockholm");
        associateValueWithKey.associateValueWithKeyHashMap(map, "Egypt", "Cairo");
        associateValueWithKey.associateValueWithKeyHashMap(map, "New Zealand", "Wellington");

        int length = mapSizeCounter.mapSizeCounter(map);
        System.out.println(length);

        HashMap<String, String> copiedMap = mapCopy.mapCopy(map);
        System.out.println(copiedMap);

        mapClearer.mapClearer(copiedMap);
        System.out.println(copiedMap);

        boolean isMapEmpty = mapEmptyChecker.isMapEmpty(copiedMap);
        System.out.println(isMapEmpty);

        HashMap<String, String> shallowCopy = hashMapShallowCopy.hashMapShallowCopy(map);
        System.out.println(shallowCopy);

        boolean hasKey = mapKeyPresenceTester.mapKeyPresenceTester(map, "Romania");
        System.out.println(hasKey);

        boolean hasValue = mapValuePresenceTester.hasValue(map, "Cairo");
        System.out.println(hasValue);

        mapMappingsSet.mapMappingsSet(map);

        mapValueGetter.mapValueGetter(map, "Egypt");

        mapKeysSetView.mapKeysSetView(map);

        mapValuesCollectionView.mapValuesCollectionView(map);
    }
}
