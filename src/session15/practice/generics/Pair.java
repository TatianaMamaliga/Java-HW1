package session15.practice.generics;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair = new Pair<>("Score", 103);
        System.out.println(stringIntegerPair.getKey() + ": " + stringIntegerPair.getValue());

    }
}
