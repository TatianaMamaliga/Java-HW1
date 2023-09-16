package session14.challenge14.linkedList;

import java.util.LinkedList;

public class GetFirstLastOccurrencesLinkedList {

    public void getFirstLastOccurrencesLinkedList(LinkedList<String> list, String element) {
        int firstOccurence = -1;
        int lastOccurence = -1;

        if (isElInList(list, element)) {
            firstOccurence = list.indexOf(element);
            lastOccurence = list.lastIndexOf(element);
        } else {
            System.out.println("Element is not in the list");
        }

        if (firstOccurence == lastOccurence) {
            System.out.println(element + " appears only once at index: " + firstOccurence);
        } else if (firstOccurence != -1) {
            System.out.println(element + " appears at index: " + firstOccurence + " and at index: " + lastOccurence);
        }

    }

    private boolean isElInList(LinkedList<String> list, String el) {
        if (list.contains(el)) {
            return true;
        }
        return false;
    }
}
