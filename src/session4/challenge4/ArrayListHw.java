package session4.challenge4;

import java.util.ArrayList;

public class ArrayListHw {

    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();
        listOne.add("Romania");
        listOne.add("France");
        listOne.add("Ecuador");

        // assign listOne to listTwo array
        listTwo = listOne;

        // modify listOne by adding a new element
        listOne.add("Denmark");

        System.out.println(listOne); // displays 4 array elements added prev
        System.out.println(listTwo); // listTwo array has 4 elements previously added to listOne, thus those are equal, per below:
        System.out.println(listOne.equals(listTwo)); // prints true
    }
}
