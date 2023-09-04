package session11.challenge11.p3;

public class StudentMarksEx {

    public static void main(String[] args) {
        A studentAMarks = new A();
        float marksA = studentAMarks.getPercentage();
        System.out.println("Percentage for student A is: " + marksA + " %");

        B studentBMarks = new B();
        float marksB = studentBMarks.getPercentage();
        System.out.println("Percentage for student B is: " + marksB + " %");
    }
}
