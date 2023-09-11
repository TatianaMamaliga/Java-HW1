package session13.challenge13.onlineShoppingSystem;

public class Payment {
    private String paymentMethod;
    private double amount;
    private boolean paymentStatus;

    public Payment(String paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paymentStatus = false;
    }

    public void processPayment(double orderCost) {
        if (amount == orderCost) {
            this.paymentStatus = true;
        } else {
            System.out.println("Entered amount is not the same as cost.");
        }
    }

    public void updatePaymentStatus(boolean status) {
        this.paymentStatus = status;
    }

    public boolean isPaymentProcessed() {
        return paymentStatus;
    }

    public void displayPaymentInformation() {
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Payment amount: " + amount);
        System.out.println("Payment status: " + (paymentStatus ? "Successful" : "Unsuccessful"));
    }
}
