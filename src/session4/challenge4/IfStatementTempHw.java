package session4.challenge4;

public class IfStatementTempHw {

    public static void main(String[] args) {
        int temperature = 30;
        String state;

        if (temperature > 30) {
            state = "Hot";
        } else if (temperature <= 30 && temperature >= 20) {
            state = "Warm";
        } else {
            state = "Cold";
        }
        System.out.println(state);
    }
}
