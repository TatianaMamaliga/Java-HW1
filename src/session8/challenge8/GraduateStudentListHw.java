package session8.challenge8;

import java.util.ArrayList;
import java.util.List;

public class GraduateStudentListHw {

    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        List<String> graduateStudentList;

        studentList.add("Stephen King");
        studentList.add("Vero Clear");
        studentList.add("German Sapienz");
        studentList.add("Aurora Noah");
        studentList.add("Alex Zusak");
        studentList.add("Tara Ducret");
        studentList.add("Naomi Iny");
        studentList.add("Heidi Hugo");
        studentList.add("Franz Haig");
        studentList.add("Russel Hobbes");

        graduateStudentList = studentList;

        for (String graduateStudent : graduateStudentList) {
            System.out.println(graduateStudent);
        }
    }
}
