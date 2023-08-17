package session6.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        String result = "";
//        System.out.println(result.trim().isEmpty());
        for (int i = 0; i < 10; i++){
            result += 'a';
        }
//        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++){
            stringBuilder.append('a');
        }
        String result2 = stringBuilder.toString();
        System.out.println(result2);
    }
}
