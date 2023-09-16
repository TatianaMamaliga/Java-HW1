package session14.challenge14.treeSet;

import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        TreeSet<String> colors1 = new TreeSet<>();

        CreateTreeSetAndPrint createTreeSetAndPrint = new CreateTreeSetAndPrint();
        IterateThroughTreeSet iterator = new IterateThroughTreeSet();
        AddAllToAnotherTreeSet addAll = new AddAllToAnotherTreeSet();
        ReverseOrderView reverseOrderView = new ReverseOrderView();
        CloneTreeSet cloneTreeSet = new CloneTreeSet();
        GetNumberOfElements getNumberOfElements = new GetNumberOfElements();
        CompareTwoTreeSets compareTwoTreeSets = new CompareTwoTreeSets();
        FindNumbersLessThan7 findNumbersLessThan7 = new FindNumbersLessThan7();
        GetGreaterThanOrEqualToElement getGreaterThanOrEqualToEl = new GetGreaterThanOrEqualToElement();
        GetLessThanOrEqualToElement getLessThanOrEqualToElement = new GetLessThanOrEqualToElement();
        GetStrictlyGreaterThanOrEqualToElement getStrictlyGreaterThanOrEqualToEl = new GetStrictlyGreaterThanOrEqualToElement();
        GetStrictlyLessThanElement getStrictlyLessThanEl = new GetStrictlyLessThanElement();
        RetrieveAndRemoveFirstElement retrieveAndRemoveFirstEl = new RetrieveAndRemoveFirstElement();
        RetrieveAndRemoveLastElement retrieveAndRemoveLastEl = new RetrieveAndRemoveLastElement();
        RemoveGivenElementFromTreeSet removeGivenEl = new RemoveGivenElementFromTreeSet();


        createTreeSetAndPrint.addElToTreeSet(colors, "Blue");
        createTreeSetAndPrint.addElToTreeSet(colors, "Yellow");
        createTreeSetAndPrint.addElToTreeSet(colors, "Green");
        createTreeSetAndPrint.addElToTreeSet(colors1, "Violet");
        createTreeSetAndPrint.addElToTreeSet(colors1, "Red");
        createTreeSetAndPrint.addElToTreeSet(colors1, "Magenta");


        createTreeSetAndPrint.printTreeSet(colors);
        iterator.iterateThroughTreeSet(colors);
        addAll.addAllToAnotherTreeSet(colors1, colors);
        System.out.println(colors1);

        reverseOrderView.reverseOrderView(colors1);
        TreeSet<String> clonedTreeSet = cloneTreeSet.cloneTreeSet(colors);
        int length = getNumberOfElements.getNumberOfElements(clonedTreeSet);
        System.out.println("Cloned TreeSet has the elements: " + clonedTreeSet + " and its length is: " + length);
        boolean areEqual = compareTwoTreeSets.compareTwoTreeSets(colors, colors1);
        System.out.println(areEqual);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);
        findNumbersLessThan7.findNumbersLessThan7(numbers);

        getGreaterThanOrEqualToEl.getGreaterThanOrEqualToElement(numbers, 5);
        getLessThanOrEqualToElement.getLessThanOrEqualToElement(numbers, 7);

        getStrictlyGreaterThanOrEqualToEl.getStrictlyGreaterThanOrEqualToElement(numbers, 6);
        getStrictlyLessThanEl.getStrictlyLessThanElement(numbers, 7);

        int num = retrieveAndRemoveFirstEl.retrieveAndRemoveFirstElement(numbers);
        System.out.println("Retrieved number: " + num);
        System.out.println("TreeSet after removal of first element: " + numbers);

        int numLast = retrieveAndRemoveLastEl.retrieveAndRemoveLastElement(numbers);
        System.out.println("Retrieved number: " + numLast);
        System.out.println("TreeSet after removal of last element: " + numbers);

        removeGivenEl.removeGivenElementFromTreeSet(numbers, 5);
        System.out.println(numbers);
    }
}
