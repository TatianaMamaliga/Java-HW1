package session8.challenge8;

import java.util.LinkedList;
import java.util.List;

public class StudentListCheckHw {

    public static void main(String[] args) {
        List<String> studentNameList = new LinkedList<>();
        studentNameList.add("Carolina");
        studentNameList.add("Victor");

        addNameToList(studentNameList, "Carolina");

        System.out.println(studentNameList);
    }

    public static void addNameToList(List list, String name){
        if (list.contains(name)) {
            System.out.println("Name is in the list and will be removed. The new list is: ");
            list.remove(name);
        } else {
            System.out.println("Name is not in the list");
        }
    }
}
