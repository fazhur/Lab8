package ua.edu.ucu.apps.flowerstore.payment;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.general.Order;

public class ContextPayment {
    @Getter
    private PaymentStrategy strategy;
    private Order order;
    private double price;

    public ContextPayment(Order order, double price) {
        this.order = order;
        this.price = price;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public String pay() {
        boolean paymentSuccess = strategy.pay(order, price);
        if (paymentSuccess)
            return "Payment successful";
        else
            return "Payment failed";
    }
}
