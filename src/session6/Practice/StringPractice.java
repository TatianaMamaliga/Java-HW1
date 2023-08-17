package session6.Practice;

public class StringPractice {

    public static void main(String[] args) {
        String animal1 = "Lion";
        String animal2 = new String("Lion");
        String animal3 = "Lion";
        String name = "Joanna D'Ark";


//        System.out.println(animal1 == animal2);
//        System.out.println(animal1 == animal3);

//        System.out.println("animal1 hashcode: " + Integer.toHexString(System.identityHashCode(animal1)));
//        System.out.println("animal2 hashcode: " + Integer.toHexString(System.identityHashCode(animal2)));
//        System.out.println("animal2 hashcode: " + Integer.toHexString(System.identityHashCode(animal3)));

        garbageCollectorExample();
        stringConcat();

        System.out.println("Length is: " + getStringLength(animal1));
        char stringCharacter = getStringChar(animal1, 0);
        System.out.println(stringCharacter);

        System.out.println(animal1.indexOf('o'));

        System.out.println(name.substring(0,2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(getStringStartsWith(name, "J")); // case sensitive
        System.out.println(getStringEndsWith(name, "rk")); // case sensitive

        String sentence = " I enjoy summer. ";
//        System.out.println(sentence.contains("enjoy")); // case sensitive
//        System.out.println(sentence.replace("summer", "autumn"));

        sentence = sentence.trim().replace('o', 'x').toLowerCase();
        System.out.println(sentence);

    }
    public static void garbageCollectorExample(){
        String name = "Andrew";
        System.out.println(name);

        name = "Jane";
        System.out.println(name);

        User user = new User();
        user.setName("Alba");
        System.out.println(user);

        user = new User();
        System.out.println(user);
    }
    public static void stringConcat(){
        String value1 = "Robin";
        String value2 = "Hood";

        System.out.println(Integer.toHexString(System.identityHashCode(value1)));

        value1 = value1.concat(value2);
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));
    }
    public static int getStringLength (String input){
        return input.length();
    }
    public static char getStringChar(String input, int index){
        return input.charAt(index);
    }

    public static Boolean getStringStartsWith(String input, String startsWith){
        return input.startsWith(startsWith);
    }
    public static boolean getStringEndsWith(String input, String endsWith){
        return input.endsWith(endsWith);
    }
}
