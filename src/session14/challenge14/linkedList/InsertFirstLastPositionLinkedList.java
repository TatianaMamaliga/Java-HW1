package session14.challenge14.linkedList;

import java.util.LinkedList;

public class InsertFirstLastPositionLinkedList {

    public void insertFirstLastPositionLinkedList(LinkedList<String> list, String firstEl, String lastEl) {
        list.offerFirst(firstEl);
        list.offerLast(lastEl);
    }
}
