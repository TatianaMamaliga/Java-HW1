package session14.challenge14.linkedList;

import java.util.LinkedList;

public class RemoveElementFromLinkedList {

    public void removeElementFromLinkedList(LinkedList<String> list, String element) {
        LinkedList<Integer> indexes = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                indexes.add(i);
            }
        }

        for (int i = 0; i < indexes.size(); i++) {
            list.remove(element);
        }
    }
}
