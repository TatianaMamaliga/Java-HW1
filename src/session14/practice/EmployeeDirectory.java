package session14.practice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDirectory {

    public static void main(String[] args) {
        Map<String, String> employeeMap1 = new HashMap<>();

        employeeMap1.put("E100", "Klenny");
        employeeMap1.put("E101", "DJohn");
        employeeMap1.put("E102", "PAndrew");

        Map<String, String> employeeMap2 = new HashMap<>();
        employeeMap2.put("E102", "PAndrew");
        employeeMap2.put("E103", "DJane");

        System.out.println("Employee group 1: ");
        displayEmployeeInfo(employeeMap1);

        System.out.println("Common entry of group 1 & 2: ");
        displayEmployeeInfo(getCommonEntries(employeeMap1, employeeMap2));

    }

    private static void displayEmployeeInfo(Map<String, String> map) {
        for (Map.Entry<String, String> employee : map.entrySet()) {
            System.out.println("Employee with ID: " + employee.getKey() + ", employee LDAP: " + employee.getValue());
        }
    }

    private static Map<String, String> getCommonEntries(Map<String, String> map1, Map<String, String> map2) {
       Map<String, String> commonEntries = new HashMap<>();
       for (String key : map1.keySet()) {
           if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
               commonEntries.put(key, map1.get(key));
           }
       }
        return commonEntries;
    }
}
