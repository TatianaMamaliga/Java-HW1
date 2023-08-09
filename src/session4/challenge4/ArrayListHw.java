package session4.challenge4;

import java.util.ArrayList;

public class ArrayListHw {

    public static void main(String[] args) {
        // Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
        // Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element.
        // Print both lists and observe the output.
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo;
        listOne.add("Romania");
        listOne.add("France");
        listOne.add("Ecuador");

        // assign listOne to listTwo array;
        listTwo = listOne;

        System.out.println(listOne); // displays 3 array elements added prev
        System.out.println(listTwo); // listTwo array has 3 elements previously added to listOne, thus those are equal, per below:
        System.out.println(listOne.equals(listTwo)); // print true
    }
}
