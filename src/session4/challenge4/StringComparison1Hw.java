package session4.challenge4;

public class StringComparison1Hw {

    public static void main(String[] args) {
        // case 1
        String countryOne = "USA";
        String countryTwo = "USA";
        System.out.println("Case1: Are the strings equal? " + (countryOne.equals(countryTwo))); // prints true (case1: USA vs USA)

        // case 2
        countryTwo = "UK";
        System.out.println("Case2: Are the strings equal? " + (countryOne.equals(countryTwo))); // prints false (case2: USA vs UK)
    }
}
