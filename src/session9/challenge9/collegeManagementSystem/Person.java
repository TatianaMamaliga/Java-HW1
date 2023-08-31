package session9.challenge9.collegeManagementSystem;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String birthDate;
    private String cnp;
    private String address;

    public Person(String firstName, String lastName, String sex, String birthDate, String cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        getAge(birthDate);
        this.sex = sex;
        this.cnp = cnp;
        this.address = address;
    }

    static class Professor extends Person {
        public Professor(String firstName, String lastName, String sex, String birthDate, String cnp, String address) {
            super(firstName, lastName, sex, birthDate, cnp, address);
        }
    }

    static class Student extends Person {
        public Student(String firstName, String lastName, String sex, String birthDate, String cnp, String address) {
            super(firstName, lastName, sex, birthDate, cnp, address);
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void getAge (String birthDate) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate formattedBirthDate = LocalDate.parse(birthDate, dateFormatter);
        Period agePeriod = Period.between(formattedBirthDate, today);

        this.age = agePeriod.getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", cnp='" + cnp + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
