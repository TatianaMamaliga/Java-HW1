package session8.challenge8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityNamesArrayListHw {

    public static void main(String[] args) {
        List<String> cityNameList = new ArrayList<>();

        addCityNames(cityNameList);
    }

    public static void addCityNames(List list){
        list.add("Alba");
        list.add("Barcelona");
        list.add("Cracow");
        list.add("Dunkirk");
        list.add("Edinburgh");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a city name to the list: ");
        String userCityName = scanner.next();

        if (!list.contains(userCityName)) {
            list.add(userCityName);
            System.out.println("City name successfully added to the list.");
            System.out.println(list);
        } else {
            System.out.println("City name is already in the list.");
        }
    }
}
