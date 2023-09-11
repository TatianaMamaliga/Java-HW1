package session13.challenge13.onlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<Product> productInventory = new ArrayList<>();
    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void addProductToInventory(Product product, int quantity) {
        product.setQuantity(quantity);
        productInventory.add(product);
    }

    public boolean isProductAvailable(Product product) {
        if (product.getQuantity() > 0) {
            return true;
        }
        return false;
    }

    public void removeProductFromInventory(Product product) {
        productInventory.remove(product);
    }

    @Override
    public String toString() {
        return "Product{" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
