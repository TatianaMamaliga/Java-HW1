package session15.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        Box<String> stringBox = new Box<>();
        stringBox.setObject("Map");

        System.out.println(stringBox.getObject());

        Integer[] integers = {13, 17, 23};
        String[] strings = {"list", "set", "map"};

        printArray(integers);
        printArray(strings);
    }

    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element + " ");
        }
    }
}
