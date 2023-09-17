package session14.challenge14.hashMap;


import java.util.Collection;
import java.util.HashMap;

public class MapValuesCollectionView {

    public void mapValuesCollectionView(HashMap<String, String> map) {
        Collection<String> capitalCities = map.values();

        for (String value : capitalCities) {
            System.out.println(value);
        }
    }
}
