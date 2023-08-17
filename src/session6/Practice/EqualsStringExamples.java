package session6.Practice;

public class EqualsStringExamples {

    public static void main(String[] args) {
        String colour1 = "Blue";
        String colour2 = "blUe";

        System.out.println(colour1.equals(colour2));
        System.out.println(colour1.equalsIgnoreCase(colour2));
        System.out.println(colour1.toLowerCase().equals(colour2.toLowerCase()));
    }
}
