package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;

public class PaymentTests {
    private CreditCardPaymentStrategy creditCard;
    private PayPalPaymentStrategy payPal;

    @BeforeEach
    public void init() {
        creditCard = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testPaymentStrategies() {
        Assertions.assertEquals(300.0,creditCard.pay(300.0));
        Assertions.assertEquals(200.0, payPal.pay(200.0));
    }
}