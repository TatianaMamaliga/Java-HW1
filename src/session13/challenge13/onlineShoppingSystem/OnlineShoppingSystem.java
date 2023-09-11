package session13.challenge13.onlineShoppingSystem;

public class OnlineShoppingSystem {

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "john.doe@personal.com", "shipping address text placeholder", "billing address text placeholder");
        Product product = new Product("Royal Canin Regular Sterilised 37", "Balanced and complete feed for cats - specially for neutered cats (from 1 to 7 years old), 4 kg", 179.90);
        product.addProductToInventory(product, 10000);

        customer.addProductToShoppingCart(product, 2);
        System.out.println("Shopping cart: ");
        customer.displayShoppingCart();

        Order order = customer.placeOrder(customer);
        System.out.println("Orders: ");
        customer.displayOrders();
        System.out.println("Shopping cart: ");
        customer.displayShoppingCart();

        customer.getOrderStatus(order);
        System.out.println("Order cost: " + order.calculateOrderCost());

        order.setStatus("received");

        customer.getOrderStatus(order);

        Payment payment = new Payment("card", 359.8);
        payment.processPayment(order.calculateOrderCost());
        payment.displayPaymentInformation();

    }
}
