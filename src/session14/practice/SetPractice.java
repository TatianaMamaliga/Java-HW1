package session14.practice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> products = initializeSet();
        System.out.println(products);

        System.out.println("Set 1 entries: ");
        displayProducts(products);
        Set<String> products1 = initializeSet();
        products1.add("P103");
        products1.add("P104");

        System.out.println("Merged set: ");
        System.out.println(mergeProducts(products, products1));
    }

    private static Set<String> initializeSet() {
        Set<String> products = new HashSet<>();
        products.add("P100");
        products.add("P101");
        products.add("P102");
        return products;
    }

    private static void displayProducts(Set<String> products) {
        for (String product : products) {
            System.out.println(product);
        }
    }

    private static Set<String> mergeProducts(Set<String> set1, Set<String> set2) {
        Set<String> mergedSet = new HashSet<>(set1);
        mergedSet.addAll(set2);

        return mergedSet;
    }
}
