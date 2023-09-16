package session14.challenge14.linkedList;

import java.util.LinkedList;

public class ReverseIterateLinkedList {

    public void reverseIterateLinkedList(LinkedList<String> list) {
        System.out.println("Iterating LinkedList in reverse order: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i + " " + list.get(i));
        }
    }
}
