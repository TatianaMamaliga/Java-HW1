package session14.challenge14.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class SwapTwoElementsInLinkedList {

    public void swapTwoElementsInLinkedList(LinkedList<String> list, String el1, String el2) {
        int index1 = list.indexOf(el1);
        int index2 = list.indexOf(el2);

        list.set(index1, el2);
        list.set(index2, el1);
    }
}
