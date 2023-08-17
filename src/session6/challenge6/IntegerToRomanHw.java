package session6.challenge6;

public class IntegerToRomanHw {

    public static void main(String[] args) {
        int year = 2587;
        System.out.println(convertIntToRoman(year));
    }

    public static String convertIntToRoman(int number) {
        StringBuilder romanNum = new StringBuilder();

        while (number > 0) {
            if (number >= 1000) {
                romanNum.append("M");
                number -= 1000;
            } else if (number >= 900 && number < 1000) {
                romanNum.append("CM");
                number -= 900;
            } else if (number < 900 && number >= 500) {
                romanNum.append("D");
                number -= 500;
            } else if (number < 500 && number >= 400) {
                romanNum.append("CD");
                number -= 400;
            } else if (number < 400 && number >= 100) {
                romanNum.append("C");
                number -= 100;
            } else if (number < 100 && number >= 90) {
                romanNum.append("XC");
                number -= 90;
            } else if (number < 90 && number >= 50) {
                romanNum.append("L");
                number -= 50;
            } else if (number < 50 && number >= 40) {
                romanNum.append("XL");
                number -= 40;
            } else if (number < 40 && number >= 10) {
                romanNum.append("X");
                number -= 10;
            } else if (number == 9) {
                romanNum.append("IX");
                number -= 9;
            } else if (number < 9 && number >= 5) {
                romanNum.append("V");
                number -= 5;
            } else if (number == 4) {
                romanNum.append("IV");
                number -= 4;
            } else if (number < 4) {
                romanNum.append("I");
                number--;
            }
        }
        return romanNum.toString();
    }
}
