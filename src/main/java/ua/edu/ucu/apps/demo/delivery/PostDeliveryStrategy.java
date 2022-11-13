package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.flower.Item;

import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String deliver(LinkedList<Item> items) {
        return "Items will be delivered by post";
    }
}
