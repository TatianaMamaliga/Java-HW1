package session9.challenge9.collegeManagementSystem;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Course mathCourse = new Course("Math", "Monday", "Mathematics", LocalTime.of(8,0), LocalTime.of(10,10));
        Course computerScienceCourse = new Course("Computer Science", "Tuesday", "Computer Science", LocalTime.of(8,0), LocalTime.of(10,10));
        Course physicsCourse = new Course("Physics", "Wednesday", "Physics", LocalTime.of(8,0), LocalTime.of(10,10));
        Course chemistryCourse = new Course("Chemistry", "Wednesday", "Chemistry", LocalTime.of(10,20), LocalTime.of(12,20));
        Course biologyCourse = new Course("Biology", "Thursday", "Biology", LocalTime.of(8,0), LocalTime.of(10,10));
        Course geographyCourse = new Course("Geography", "Thursday", "Geography", LocalTime.of(8,0), LocalTime.of(10,10));
        Course englishCourse = new Course("English", "Thursday", "English", LocalTime.of(8,0), LocalTime.of(10,10));
        Course historyCourse = new Course("History", "Friday", "History", LocalTime.of(8,0), LocalTime.of(10,10));


        Person.Professor mathProfessor = new Person.Professor("Seth", "Johnson", "male", "1981-01-01", "1234567890123", "Houston");
        Person.Professor computerScienceProfessor = new Person.Professor("Liam", "Brown", "male", "1985-03-08", "7890123456789", "San Francisco");
        Person.Professor physicsProfessor = new Person.Professor("Emily", "Smith", "female", "1975-05-15", "9876543210456", "New York");
        Person.Professor chemistryProfessor = new Person.Professor("Daniel", "Williams", "male", "1980-11-20", "5678901234567", "Los Angeles");
        Person.Professor biologyProfessor = new Person.Professor("Sophia", "Martinez", "female", "1978-09-10", "2345678901234", "Chicago");
        Person.Professor geographyProfessor = new Person.Professor("Olivia", "Johnson", "female", "1973-07-25", "3456789012345", "Boston");
        Person.Professor englishProfessor = new Person.Professor("Noah", "Miller", "male", "1982-12-03", "8901234567890", "Seattle");
        Person.Professor historyProfessor = new Person.Professor("Ava", "Davis", "female", "1976-06-18", "4567890123456", "Washington, D.C.");

        Person.Student ninthGradeStudent = new Person.Student("Ina", "Brown", "female", "2008-01-01", "1234567891234", "Boston");

        mathCourse.assignProfessor(mathProfessor.getFullName());
        computerScienceCourse.assignProfessor(computerScienceProfessor.getFullName());
        physicsCourse.assignProfessor(physicsProfessor.getFullName());
        chemistryCourse.assignProfessor(chemistryProfessor.getFullName());
        biologyCourse.assignProfessor(biologyProfessor.getFullName());
        geographyCourse.assignProfessor(geographyProfessor.getFullName());
        englishCourse.assignProfessor(englishProfessor.getFullName());
        historyCourse.assignProfessor(historyProfessor.getFullName());

        System.out.println("Math course info: " + mathCourse);
        System.out.println("Math professor info: " + mathProfessor);
        System.out.println("Student info:  " + ninthGradeStudent);
    }
}
