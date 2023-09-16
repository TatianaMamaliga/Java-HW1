package session14.challenge14.linkedList;

import java.util.LinkedList;

public class DisplayElementsAndPositionsLinkedList {

    public void displayElementsAndPositionsLinkedList(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + " Element: " + list.get(i));
        }
    }
}
