package ua.edu.ucu.apps.demo.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "The price is" + price + "and payment will be proceed in credit card.";
    }
}
