package session13.challenge13.onlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Product> shoppingCart = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();
    private String name;
    private String email;
    private String shippingAddress;
    private String billingAddress;

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public void addProductToShoppingCart(Product product, int quantity) {
        if (product.isProductAvailable(product)) {
            product.setQuantity(quantity);
            shoppingCart.add(product);
        }
    }

    public void removeProductFromShoppingCart(Product product) {
        shoppingCart.remove(product);
    }

    public Order placeOrder(Customer customer) {
        Order order = new Order(customer, shoppingCart, "created");
        orderList.add(order);
        return order;
    }

    public void clearShoppingCart() {
        shoppingCart.clear();
    }

    public void displayOrders() {
        for (Order order : orderList) {
            System.out.println(order.toString());
        }
    }

    public void getOrderStatus(Order order) {
        System.out.println(order.getStatus());
    }


    public void displayShoppingCart() {
        for (Product product : shoppingCart) {
            System.out.println(product.toString());
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                '}';
    }
}
