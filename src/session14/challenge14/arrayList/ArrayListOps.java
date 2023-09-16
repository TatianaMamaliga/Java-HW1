package session14.challenge14.arrayList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOps {

    public static void main(String[] args) {
        System.out.println("initial list");
        ArrayList<String> colorList = colorArrayList();

        System.out.println("printed each element");
        printArrayListEl(colorList);

        System.out.println("added element at position 0");
        addElement(colorList, "element");

        System.out.println("Color list:");
        printArrayListEl(colorList);

        getElementAtIndex(colorList, 6);

        updateElement(colorList, "element", "Reddish");

        removeThirdEl(colorList);

        searchElement(colorList, "Blue");

        sortArrayList(colorList);

        ArrayList<String> duplicateColorList = copyArray(colorList);

        System.out.println("Duplicated color list: " + duplicateColorList);

        shuffleArray(duplicateColorList);

        System.out.println("Shuffle applied on duplicated list: " + duplicateColorList);

        reverseArray(colorList);

        System.out.println("Reversed list: " + colorList);

        List<String> partialList = extractArrayPart(colorList, 3, 5);
        System.out.println(partialList);

        boolean areEqual = areArraysEqual(duplicateColorList, colorList);
        System.out.println(areEqual);

        swapTwoElements(colorList, "Green", "Blue");

        ArrayList<String> newColorList = new ArrayList<>();
        newColorList.add("Pink");
        newColorList.add("Brown");
        newColorList.add("Magenta");

        joinTwoArrayLists(colorList, newColorList);

        System.out.println(colorList);

        ArrayList<String> clonedArrayList = cloneArrayList(newColorList);
        System.out.println("Cloned ArrayList: " + clonedArrayList);

        emptyArrayList(clonedArrayList);

        isArrayListEmpty(clonedArrayList);

        trimArrayListCapacity(colorList);

        increaseArrayListCapacity(colorList, 20);

        calculateProgress(52);
    }

    private static void calculateProgress(double problemsDone) {
        double progress = ((problemsDone / 97) * 100);
        System.out.println("Progress: " + progress + " %");
    }

    private static ArrayList<String> colorArrayList() {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Orange");
        colorList.add("Yellow");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Indigo");
        colorList.add("Violet");

        System.out.println(colorList);

        return colorList;
    }

    private static void printArrayListEl(ArrayList<String> list) {
        for (String el : list) {
            System.out.println(el);
        }
    }

    private static void addElement(ArrayList<String> list, String element) {
        list.add(0, element);
    }

    private static void getElementAtIndex(ArrayList<String> list, int index) {
        String element = list.get(index);
        System.out.println("Element at index: " + index + " is: " + element);
    }

    private static void updateElement(ArrayList<String> list, String element, String newElValue) {
        int elIndex = list.indexOf(element);
        list.set(elIndex, newElValue);
        System.out.println("Updated value in the list at index: " + elIndex + " is: " + list.get(elIndex));
    }

    private static void removeThirdEl(ArrayList<String> list) {
        list.remove(3);
    }

    private static void searchElement(ArrayList<String> list, String element) {
        if (list.contains(element)) {
            System.out.println("Element '" + element + "' is found at index " + list.indexOf(element));
        } else {
            System.out.println("Element is not in the list");
        }
    }

    private static void sortArrayList(ArrayList<String> list) {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }

    private static ArrayList<String> copyArray(ArrayList<String> list) {
        return new ArrayList<>(list);
    }

    private static void shuffleArray(ArrayList<String> list) {
        Collections.shuffle(list);
    }

    private static void reverseArray(ArrayList<String> list) {
        Collections.reverse(list);
    }

    private static List<String> extractArrayPart(ArrayList<String> list, int startIndex, int endIndex) {
        return list.subList(startIndex, endIndex);
    }

    private static boolean areArraysEqual(ArrayList<String> list1, ArrayList<String> list2) {
        return list1.containsAll(list2);
    }

    private static void swapTwoElements(ArrayList<String> list, String el1, String el2) {
        int index1 = list.indexOf(el1);
        int index2 = list.indexOf(el2);

        list.set(index1, el2);
        list.set(index2, el1);
    }

    private static void joinTwoArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        list1.addAll(list2);
    }

    private static ArrayList<String> cloneArrayList(ArrayList<String> list1) {
        return (ArrayList<String>) list1.clone();
    }

    private static void emptyArrayList(ArrayList<String> list) {
        list.clear();
    }

    private static void isArrayListEmpty(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Array is not empty");
        }
    }

    private static void trimArrayListCapacity(ArrayList<String> list) {
        list.trimToSize();
    }

    private static void increaseArrayListCapacity(ArrayList<String> list, int capacity) {
        list.ensureCapacity(capacity);
    }

}
