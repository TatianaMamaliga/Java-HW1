package session14.challenge14.linkedList;

import java.util.LinkedList;

public class IterateFromPositionInLinkedList {

    public void iterateFromPositionInLinkedList(LinkedList<String> list, int startingIndex) {
        System.out.println("Iteration through LinkedList starting from index: " + startingIndex);
        for (int i = startingIndex; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
