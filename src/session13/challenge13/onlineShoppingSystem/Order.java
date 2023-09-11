package session13.challenge13.onlineShoppingSystem;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Order {

    private UUID orderNumber;
    private Customer customer;
    private List<Product> products;
    private String status;

    public Order(Customer customer, List<Product> products, String status) {
        orderNumber = UUID.randomUUID();
        this.customer = customer;
        this.products = products;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calculateOrderCost() {
        double orderCost = 0;
        for (Product product : products) {
            orderCost += product.getQuantity() * product.getPrice();
        }
        return orderCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer=" + customer.toString() +
                ", products=" + products +
                ", status='" + status + '\'' +
                '}';
    }
}
