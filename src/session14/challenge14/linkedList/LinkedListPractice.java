package session14.challenge14.linkedList;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Green");

        AppendElementToLinkedList append = new AppendElementToLinkedList();
        IterateThroughLinkedList iterator = new IterateThroughLinkedList();
        IterateFromPositionInLinkedList iteratorWithIndex = new IterateFromPositionInLinkedList();
        ReverseIterateLinkedList reverseIterator = new ReverseIterateLinkedList();
        InsertElementAtPositionInLinkedList insertElAtPosition = new InsertElementAtPositionInLinkedList();
        InsertFirstLastPositionLinkedList insertFirstLastEl = new InsertFirstLastPositionLinkedList();
        InsertFrontElementLinkedList insertElAtFront = new InsertFrontElementLinkedList();
        InsertEndElementLinkedList insertElAtEnd = new InsertEndElementLinkedList();
        InsertElementsAtPositionLinkedList insertElementsAtPosition = new InsertElementsAtPositionLinkedList();
        GetFirstLastOccurrencesLinkedList getFirstLastIndex = new GetFirstLastOccurrencesLinkedList();
        DisplayElementsAndPositionsLinkedList displayElAndPosition = new DisplayElementsAndPositionsLinkedList();
        RemoveElementFromLinkedList removeElementFromLinkedList = new RemoveElementFromLinkedList();
        RemoveFirstLastElementsLinkedList removeFirstLastEl = new RemoveFirstLastElementsLinkedList();
        RemoveAllElementsLinkedList removeAllEl = new RemoveAllElementsLinkedList();
        SwapTwoElementsInLinkedList swapTwoEl = new SwapTwoElementsInLinkedList();
        ShuffleElementsInLinkedList shuffleEl = new ShuffleElementsInLinkedList();
        JoinTwoLinkedLists joinTwoLinkedLists = new JoinTwoLinkedLists();
        CloneLinkedList cloneLinkedList = new CloneLinkedList();
        RemoveAndReturnFirstElementLinkedList removeAndReturnFirstEl = new RemoveAndReturnFirstElementLinkedList();
        RetrieveFirstElementLinkedList retrieveFirstEl = new RetrieveFirstElementLinkedList();


        append.appendElementToLinkedList(colorList, "Red");
        iterator.iterateThroughLinkedList(colorList);
        iteratorWithIndex.iterateFromPositionInLinkedList(colorList, 1);
        reverseIterator.reverseIterateLinkedList(colorList);
        insertElAtPosition.insertElementAtPositionInLinkedList(colorList, 0, "White");
        insertFirstLastEl.insertFirstLastPositionLinkedList(colorList, "Blue", "Pink");
        insertElAtFront.insertFrontElementLinkedList(colorList, "Magenta");
        insertElAtEnd.insertEndElementLinkedList(colorList, "Lightblue");
        insertElementsAtPosition.insertElementsAtPositionLinkedList(colorList, 2, "Yellow", "Scarlet", "Lime");
        getFirstLastIndex.getFirstLastOccurrencesLinkedList(colorList, "Red");
        displayElAndPosition.displayElementsAndPositionsLinkedList(colorList);
        removeElementFromLinkedList.removeElementFromLinkedList(colorList, "Red");
        removeFirstLastEl.removeFirstLastElementsLinkedList(colorList);

        LinkedList<String> duplicatedList = new LinkedList<>(colorList);
        removeAllEl.removeAllElementsLinkedList(duplicatedList);

        swapTwoEl.swapTwoElementsInLinkedList(colorList, "Pink", "Blue");
        shuffleEl.shuffleElementsInLinkedList(colorList);

        LinkedList<String> listToJoin = new LinkedList<>();
        listToJoin.add("Grey");
        listToJoin.add("Beige");

        joinTwoLinkedLists.joinTwoLinkedLists(listToJoin, colorList);
        LinkedList clonedList = cloneLinkedList.cloneLinkedList(colorList);
        System.out.println("Cloned list: " + clonedList);

        String firstELRemovedAndRetrieved = removeAndReturnFirstEl.removeAndReturnFirstElementLinkedList(colorList);
        System.out.println(firstELRemovedAndRetrieved);

        String firstElRetrieved = retrieveFirstEl.retrieveFirstElementLinkedList(colorList);
        System.out.println(firstElRetrieved);

        System.out.println(colorList);
    }
}
