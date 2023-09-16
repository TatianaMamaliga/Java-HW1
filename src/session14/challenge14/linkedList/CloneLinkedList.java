package session14.challenge14.linkedList;

import java.util.LinkedList;

public class CloneLinkedList {

    public LinkedList<String> cloneLinkedList(LinkedList<String> list) {
        LinkedList<String> clonedList = new LinkedList<>();
        clonedList = (LinkedList<String>) list.clone();
        return clonedList;
    }
}
