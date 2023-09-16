package session14.challenge14.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class InsertElementsAtPositionLinkedList {

    public void insertElementsAtPositionLinkedList(LinkedList<String> list, int index, String el1, String el2, String el3) {
        LinkedList<String> elToAdd = new LinkedList<>();
        elToAdd.add(el1);
        elToAdd.add(el2);
        elToAdd.add(el3);
        list.addAll(index, elToAdd);
    }
}
