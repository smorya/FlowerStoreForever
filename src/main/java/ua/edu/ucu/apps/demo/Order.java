package ua.edu.ucu.apps.demo;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.flower.Item;
import java.util.LinkedList;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.delivery.Delivery;
@Getter
@Setter
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment newPayment){
        payment = newPayment;
    }
    public void setDeliveryStrategy(Delivery newDelivery){
        delivery = newDelivery;
    }
    public double calculateTotalPrice(){
        double price = 0;
        for (Item item:
             items) {
            price += item.price();
        }
        return price;
    }
    public void processOrder(){
        System.out.println("Processing order");
    }
    public void addItem(Item newItem){
        items.add(newItem);
    }
    public void removeItem(Item newItem){
        items.remove(newItem);
    }


}
